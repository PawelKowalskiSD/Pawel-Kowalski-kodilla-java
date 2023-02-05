package com.kodilla.good.patterns.challenges;

public class MessageService implements InformationService {

    @Override
    public void inform(User user) {
        if(userHAsEnteredAnEmail(user));
        if (userHasProvidedATelephoneNumber(user));
    }

    private boolean userHasProvidedATelephoneNumber(User user) {
        if(!user.getPhoneNumber().equals("-")) {
            System.out.println("=========Text message on the phone======================");
            System.out.println("Good morning, " + user.getName() +" " + user.getSurname() + "\n"
                    + "We got your order.\n"
                    + "Your order is in progress.\n"
                    + "you will get shipping  information on your phone.\n"
                    + "if you hava questions call the number: (00)468-223-115\n"
                    + "Have a nice day Jonas.\n");
            return true;
        }
        return false;
    }

    private static boolean userHAsEnteredAnEmail(User user) {
        if(!user.getEmailAddress().equals("-")) {
            System.out.println("=========Text message on the e-mail======================");
            System.out.println("Good morning, " + user.getName() +" " + user.getSurname() + "\n"
                    + "We got your order.\n"
                    + "Your order is in progress.\n"
                    + "you will get shipping  information on your email.\n"
                    + "if you hava questions send the email: marketOnline@wl.com\n"
                    + "Have a nice day Jonas.\n");
            return true;
        }
        return false;
    }
}
