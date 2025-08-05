//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = "Фамилия Имя Отчество";
        fullName = lastName + firstName + middleName;
        System.out.println(" Ф.И.О сотрудника "  + fullName);

        System.out.println (" Задача 2 ");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчет " + fullName1);
}
}