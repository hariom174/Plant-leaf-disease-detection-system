import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

class ContactManager {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName() + ", Phone Number: " + contact.getPhoneNumber());
        }
    }

    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void updateContact(Contact existingContact, String newPhoneNumber) {
        existingContact = new Contact(existingContact.getName(), newPhoneNumber);
        System.out.println("Contact updated successfully!");
    }
}

   class Contact_Management {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber);
                    contactManager.addContact(newContact);
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    contactManager.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter Name to search: ");
                    String searchName = scanner.nextLine();
                    Contact foundContact = contactManager.searchContact(searchName);
                    if (foundContact != null) {
                        System.out.println("Contact found - Name: " + foundContact.getName() + ", Phone Number: " + foundContact.getPhoneNumber());
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Name to edit existing contact: ");
                    String editName = scanner.nextLine();
                    Contact existingContact = contactManager.searchContact(editName);
                    if (existingContact != null) {
                        System.out.print("Enter new Phone Number: ");
                        String newPhoneNumber = scanner.nextLine();
                        contactManager.updateContact(existingContact, newPhoneNumber);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
