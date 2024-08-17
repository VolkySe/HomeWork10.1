public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println();
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //task2
        System.out.println();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //task3
        System.out.println();
        fullName = "Иванов Семён Семёнович";
        String correctFullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + correctFullName);
        System.out.println();
    }
}