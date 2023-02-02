public class Main {
    public static void main(String[] args) {
        Author valeriySimonenko = new Author("Валерий", "Симоненко");
        Author odonataVeter = new Author("Одоната", "Ветер");
        Author a = new Author("Автор", "Фамилия");
        Author b = new Author("Автор", "Фамилия");
        Book svetilniki = new Book("Светильники и розы", valeriySimonenko, 2011);
        Book tamara = new Book("Тамара, какого хрена?", odonataVeter, 2018);
        Book c = new Book("title", a, 2000);
        Book d = new Book("title", b, 2000);
        System.out.println(svetilniki.getAuthor().getName() + " " + svetilniki.getAuthor().getSurname() + " " + svetilniki.getTitle() + " " + svetilniki.getPublicationYear());
        System.out.println(tamara.getAuthor().getName() + " " + tamara.getAuthor().getSurname() + " " + tamara.getTitle() + " " + tamara.getPublicationYear());
        tamara.setPublicationYear(2019);
        System.out.println(tamara.getAuthor().getName() + " " + tamara.getAuthor().getSurname() + " " + tamara.getTitle() + " " + tamara.getPublicationYear());
        System.out.println(tamara);
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
        System.out.println(valeriySimonenko.equals(b));
        System.out.println(tamara.equals(d));
    }
}