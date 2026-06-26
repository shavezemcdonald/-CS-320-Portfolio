package contact;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	public void testContactCreation() {

		Contact contact = new Contact(
				"12345",
				"John",
				"Smith",
				"1234567890",
				"123 Main Street");

		assertEquals("12345", contact.getContactId());
		assertEquals("John", contact.getFirstName());
		assertEquals("Smith", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123 Main Street", contact.getAddress());
	}

	@Test
	public void testInvalidContactId() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345678901",
					"John",
					"Smith",
					"1234567890",
					"123 Main Street");
		});
	}

	@Test
	public void testInvalidFirstName() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"Johnathan11",
					"Smith",
					"1234567890",
					"123 Main Street");
		});
	}

	@Test
	public void testInvalidLastName() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"John",
					"Smithsonian",
					"1234567890",
					"123 Main Street");
		});
	}

	@Test
	public void testInvalidPhone() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"John",
					"Smith",
					"1234",
					"123 Main Street");
		});
	}

	@Test
	public void testInvalidAddress() {

		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(
					"12345",
					"John",
					"Smith",
					"1234567890",
					"1234567890123456789012345678901");
		});
	}
}