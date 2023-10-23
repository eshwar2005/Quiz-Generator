package Project;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion("What is the capital of India?", new String[]{"Delhi", "Mumbai", "Kolkata", "Chennai"}, 0);
        quiz.addQuestion("What is the national bird of India?", new String[]{"Peacock", "Sparrow", "Eagle", "Parrot"}, 0);
        quiz.addQuestion("Who is the first Prime Minister of India?", new String[]{"Mahatma Gandhi", "Jawaharlal Nehru", "Indira Gandhi", "Rajiv Gandhi"}, 1);
        quiz.addQuestion("What is the national animal of India?", new String[]{"Lion", "Elephant", "Tiger", "Leopard"}, 2);
        quiz.addQuestion("Who wrote the national anthem of India?", new String[]{"Rabindranath Tagore", "Bankim Chandra Chattopadhyay", "Mahatma Gandhi", "Subhash Chandra Bose"}, 0);
        quiz.addQuestion("What is the national sport of India?", new String[]{"Cricket", "Hockey", "Football", "Badminton"}, 1);
        quiz.addQuestion("Who was the President of India in 2020?", new String[]{"Pranab Mukherjee", "APJ Abdul Kalam", "Ram Nath Kovind", "Pratibha Patil"}, 2);
        quiz.addQuestion("Which state is known as the 'Spice Garden of India'?", new String[]{"Kerala", "Tamil Nadu", "Karnataka", "Andhra Pradesh"}, 0);
        quiz.addQuestion("Where is the headquarters of ISRO located?", new String[]{"Hyderabad", "Bangalore", "Chennai", "Delhi"}, 1);
        quiz.addQuestion("Which river is known as the 'Ganges of the South'?", new String[]{"Krishna River", "Godavari River", "Kaveri River", "Brahmaputra River"}, 2);
        quiz.takeQuiz();
    }
}