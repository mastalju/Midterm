/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
    public enum Day {
        ONE("Monday"),
        TWO("Tuesday"),
        THREE("Wednesday"),
        FOUR("Thursday"),
        FIVE("Friday"),
        SIX("Saturday"),
        SEVEN("Sunday");
        
        private String name;
        
        Day(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }

    public void nameOfDay(String code) {
        
        Day day = Day.valueOf(code.toUpperCase());
        System.out.println(day.getName());
        
    }

    public void printAllDays() {
        for (Day day : Day.values()) {
            System.out.println(day.getName());
        }
    }
}
