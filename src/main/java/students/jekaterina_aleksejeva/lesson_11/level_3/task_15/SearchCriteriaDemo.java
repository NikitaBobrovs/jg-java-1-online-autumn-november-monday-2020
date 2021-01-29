package students.jekaterina_aleksejeva.lesson_11.level_3.task_15;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book demoBook = new Book("Kuper", "Zveroboi", "1890");
        SearchCriteria author = new AuthorSearchCriteria("Kuper");
        SearchCriteria title = new TitleSearchCriteria("Zveroboi");
        SearchCriteria both = new AndSearchCriteria(author, title);
        System.out.println("Совпадение - автор книги Kuper и название Zveroboi найдено = " + both.match(demoBook));
        SearchCriteria year = new YearOfIssueSearchCriteria("1890");
        SearchCriteria both1 = new AndSearchCriteria(author, year);
        System.out.println("Совпадение - автор книги Kuper и год выпуска 1890 найдено = " + both1.match(demoBook));
        SearchCriteria both2 = new AndSearchCriteria(year, title);
        System.out.println("Совпадение - год выпуска 1890 или название Zveroboi найдено = " + both2.match(demoBook));
        SearchCriteria any = new OrSearchCriteria(author, year);
        System.out.println("Совпадение - автор книги Kuper или год выпуска 1890 найдено = " + any.match(demoBook));
        SearchCriteria any1 = new OrSearchCriteria(author, title);
        System.out.println("Совпадение - автор книги Kuper или название Zveroboi найдено = " + any1.match(demoBook));
        SearchCriteria any2 = new OrSearchCriteria(year, title);
        System.out.println("Совпадение - год выпуска 1890 или название Zveroboi найдено = " + any2.match(demoBook));
        System.out.println();
        System.out.println("Поиск совпадений, используя комбинацию OrSearchCriteria и AndSearchCriteria:");
        SearchCriteria mix = new OrSearchCriteria(both, year);
        System.out.println("Совпадение - автор книги Kuper и название Zveroboi или год выпуска 1890 найдено = " + mix.match(demoBook));
        SearchCriteria mix1 = new OrSearchCriteria(any, title);
        System.out.println("Совпадение - автор книги Kuper или год выпуска 1890 или название Zveroboi найдено = " + mix1.match(demoBook));
        SearchCriteria mix2 = new OrSearchCriteria(both1, title);
        System.out.println("Совпадение - автор книги Kuper и год выпуска 1890 или название Zveroboi найдено = " + mix2.match(demoBook));
        SearchCriteria mix3 = new OrSearchCriteria(both2, author);
        System.out.println("Совпадение - год выпуска 1890 и название Zveroboi или автор книги Kuper найдено = " + mix3.match(demoBook));
        SearchCriteria mix4 = new AndSearchCriteria(both, year);
        System.out.println("Совпадение - автор книги Kuper и название Zveroboi и год выпуска 1890 найдено = " + mix4.match(demoBook));
        SearchCriteria mix5 = new AndSearchCriteria(both2, author);
        System.out.println("Совпадение - год выпуска 1890 и название Zveroboi и автор книги Kuper найдено = " + mix5.match(demoBook));
        SearchCriteria mix6 = new AndSearchCriteria(both1, title);
        System.out.println("Совпадение - автор книги Kuper и год выпуска 1890 и название Zveroboi найдено = " + mix6.match(demoBook));
        SearchCriteria mix7 = new AndSearchCriteria(any, any1);
        System.out.println("Совпадение - автор книги Kuper или год выпуска 1890 и автор книги Kuper или название Zveroboi найдено = " + mix7.match(demoBook));
        SearchCriteria mix8 = new AndSearchCriteria(any, any2);
        System.out.println("Совпадение - автор книги Kuper или год выпуска 1890 и год выпуска 1890 или название Zveroboi найдено = " + mix8.match(demoBook));
        SearchCriteria mix9 = new AndSearchCriteria(any1, any2);
        System.out.println("Совпадение - автор книги Kuper или название Zveroboi и год выпуска 1890 или название Zveroboi найдено = " + mix9.match(demoBook));
    }
}
