public class Main {
    public static void main(String[] args) {
        Author valeriySimonenko = new Author("Валерий", "Симоненко");
        Author odonataVeter = new Author("Одоната", "Ветер");
        Book svetilniki = new Book("Светильники и розы", valeriySimonenko, 2011);
        Book tamara = new Book("Тамара, какого хрена?", odonataVeter, 2018);
        System.out.println(svetilniki.getAuthor().getName() + " " + svetilniki.getAuthor().getSurname() + " " + svetilniki.getTitle() + " " + svetilniki.getPublicationYear());
        System.out.println(tamara.getAuthor().getName() + " " + tamara.getAuthor().getSurname() + " " + tamara.getTitle() + " " + tamara.getPublicationYear());
        tamara.setPublicationYear(2019);
        System.out.println(tamara.getAuthor().getName() + " " + tamara.getAuthor().getSurname() + " " + tamara.getTitle() + " " + tamara.getPublicationYear());
    }
}