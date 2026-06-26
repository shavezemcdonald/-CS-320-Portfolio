package contact;

import java.util.ArrayList;

public class ContactService {

	private ArrayList<Contact> contacts = new ArrayList<>();

	public void addContact(Contact contact) {

		for (Contact existingContact : contacts) {

			if (existingContact.getContactId().equals(contact.getContactId())) {
				throw new IllegalArgumentException("Contact ID already exists");
			}
		}

		contacts.add(contact);
	}

	public void deleteContact(String contactId) {

		contacts.removeIf(contact -> contact.getContactId().equals(contactId));
	}

	public void updateFirstName(String contactId, String firstName) {

		for (Contact contact : contacts) {

			if (contact.getContactId().equals(contactId)) {
				contact.setFirstName(firstName);
			}
		}
	}

	public void updateLastName(String contactId, String lastName) {

		for (Contact contact : contacts) {

			if (contact.getContactId().equals(contactId)) {
				contact.setLastName(lastName);
			}
		}
	}

	public void updatePhone(String contactId, String phone) {

		for (Contact contact : contacts) {

			if (contact.getContactId().equals(contactId)) {
				contact.setPhone(phone);
			}
		}
	}

	public void updateAddress(String contactId, String address) {

		for (Contact contact : contacts) {

			if (contact.getContactId().equals(contactId)) {
				contact.setAddress(address);
			}
		}
	}
}