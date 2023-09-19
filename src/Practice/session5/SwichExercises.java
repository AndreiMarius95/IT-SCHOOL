package Practice.session5;

public class SwichExercises {
        public static void main(String[] args) {
            char grade = 'B';
            printGradeInformation(grade);
            printGradeInformationWithEnhancedSwitch(grade);
            printSeasonInfo("Winter");


        }

        private static void printGradeInformation(char grade) {
            switch (grade) {
                case 'A':
                    System.out.println("Excellent");
                    break;
                case 'B':
                    System.out.println("Good");
                    break;
                case 'C':
                    System.out.println("Average");
                    break;
                default:
                    System.out.println("Grade not recognized");
            }


        }

        private static void printGradeInformationWithEnhancedSwitch(char grade) {
            switch (grade) {
                case 'A' -> System.out.println("Excellent");
                case 'B' -> System.out.println("Good");
                case 'C' -> System.out.println("Average");
                default -> System.out.println("Grade not recognized");
            }
        }

        private static void printSeasonInfo(String season) {
            switch (season) {
                case "Winter" -> System.out.println("It's cold.");
                case "Spring" -> System.out.println("Flowers bloom.");
                case "Summer" -> System.out.println("It's hot.");
                default -> System.out.println("Unknown season");
            }
        }
    }