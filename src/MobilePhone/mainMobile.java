package MobilePhone;

import MobilePhone.MobilePhone;
import MobilePhone.Contact;

import java.util.Scanner;

//import static MobilePhone.MobilePhone.printContacts;

public class mainMobile {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilephone = new MobilePhone("407-401-9886");


    public static void main(String[] args) {

        boolean quit = false;
        startphone();
        printActions();
        while(!quit) {
            System.out.println("Choose action: \r");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    scanner.nextLine();
                    quit = true;
                    System.out.println("Quitting");
                    break;
                case 1:
                    mobilephone.printContacts();
//                    System.out.println("Case 1");
                    break;
                case 2:
                    scanner.nextLine();
                    addNewContact();
                    break;

                case 3:
                    scanner.nextLine();
                    updateContact();
                    break;
                case 4:
                    scanner.nextLine();
                    removeContact();
//                    System.out.println("Remove");
                    break;
                case 5:
                    scanner.nextLine();
                    queryContact();
//                    System.out.println("Query");
                    break;
                case 6:
                    scanner.nextLine();
                    printActions();
                    break;

            }
        }


        }


        private static void addNewContact() {
            System.out.println("Enter new Contact Name");
            String name = scanner.nextLine();
//            name = scanner.nextLine();
            System.out.println("Enter Phone");
            String phone = scanner.nextLine();
            Contact newContact = Contact.createContact(name, phone);
            if(mobilephone.addNewContact(newContact)){
                System.out.println("New contacted added: " + name + " phone: " + phone);
            }
            else {
                System.out.println("Cannot add " + name + " already in file.");
            }
        }

        public static void updateContact(){
            System.out.println("Enter Contact Name");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilephone.queryContact(name);
            if(existingContactRecord == null) {
                System.out.println("Contact Not found");
                return;
            }
            System.out.println("Enter New Name: ");
            String newName = scanner.nextLine();
            System.out.println(("Enter New Phone:"));
            String newPhone = scanner.nextLine();
            Contact updatedContactRecord = Contact.createContact(newName, newPhone);
            if(mobilephone.updateContact(existingContactRecord, updatedContactRecord)){
                System.out.println("Success");
            }
            else{
                System.out.println("Error");
            }
        }

        public static void removeContact(){
            System.out.println("Enter Contact Name");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilephone.queryContact(name);
            if(existingContactRecord == null){
                System.out.println("Contact Mot Found");
                return;
            }
            System.out.println("Confirm Delete: " + name + "\n" +
                    "Y for yes\n" +
                    "Any other key to cancel.\n");
            String input = scanner.nextLine();
            if(input == "Y"){
                mobilephone.removeContact(existingContactRecord);
                System.out.println(existingContactRecord + " removed.");
            }
            else
                System.out.println("Remove Canceled");
                return;
        }

        public static void queryContact(){
            System.out.println("Enter contact Name");
            String name = scanner.nextLine();
            Contact queryContact = mobilephone.queryContact(name);
            if(queryContact== null){
                System.out.println("Contact not found");
                return;
            }
            System.out.println("Name: " + queryContact.getName() + " phone number is " + queryContact.getPhone());

        }

        public static void startphone() {
            System.out.println("Starting phone...");
        }

        public static void printActions(){
            System.out.println("\nAvailable actions: \npress:\n" +
                                "0 - to shutdowm");
            System.out.println("1 - print contacts");
            System.out.println("2 - Add new contact");
            System.out.println("3 - Update existing contact");
            System.out.println("4 - remove existing contact");
            System.out.println("5 - query of an existing contact exists");
            System.out.println("6 - to print a list of available actions.");
//            int result = scanner.nextInt();
    }


}


























//MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//        BarkingDog.shouldWakeUp(true, 1);
//        LeapYear.isLeapYear(4);
//        DecimalComparator.areEqualByThreeDecimalPlaces(9.36523,9.356);
//        DecimalComparator.areEqualByThreeDecimalPlaces(3.1756, 3.175);
//        EqualSumChecker.hasEqualSum(1,-1,0);
//        TeenNumberChecker.hasTeen(9,989,19);
//        TeenNumberChecker.isTeen(13);
//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
//        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
//        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
//        IntEqualityPrinter.printEqual(1,1,1);
//        IntEqualityPrinter.printEqual(1,1,2);
//        IntEqualityPrinter.printEqual(-1,1,1);
//        IntEqualityPrinter.printEqual(1,21,3);
//        PlayingCat.isCatPlaying(false, 25);
//        SumOddRange.sumOdd(7,26);
////        NumberPalindrome.isPalindrome(156523);
//        NumberPalindrome.isPalindrome(-222);
//        FirstLastDigitSum.sumFirstAndLastDigit(5);
//        EvenDigitSum.getEvenDigitSum(123456789);
//        SharedDigit.hasSharedDigit(9, 9);
//        GreatestCommonDivisor.getGreatestCommonDivisor(1010, 10);
//        NumberToWords.numberToWords(12354);
//        NumberToWords.reverse(12354);
//        NumberToWords.getDigitCount(123456);
//        NumberToWords.numberToWords(10);
//        FlourPacker.canPack(6,2, 17);
//        LargestPrime.getLargestPrime(217);
////        LargestPrime.getPrime(21);
//        DiagonalStar.printSquareStar(5);
//        int [] intArray = {7,6,8,2,3};
//        TwoSumHash.twoSum(intArray,9);
//        System.out.println(TwoSumHash.twoSum(intArray,9) );
//        TwoSumHash.twoSum(new int[]{7, 6, 8, 2, 3},9);
//        int[] myIntArray = {7, 6, 8, 2, 3};
//        System.out.println(TwoSumHash.twoSum(myIntArray,9));
//        TwoSumHash2.testString();
//
////        Arrays_challenge.printArray(Arrays_challenge.sortIntegers(Arrays_challenge.getIntegers(5)));
////        MinimumElement.readInteger();
//        ReverseArray.reverse(new int[] {1,21,3,4,5});