package coding.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public final class ProfessionMapTest {

	@Test
	public void addDataToMap() throws Exception {
		ProfessionMap professionMap = new ProfessionMap();

		professionMap.addUserProfession("Daniel", "Architect");

		assertEquals(1, professionMap.getUserProfessionMap().size());
	}

	@Test
	public void getProfessionByName() throws Exception {
		ProfessionMap professionMap = new ProfessionMap();

		professionMap.addUserProfession("Marion", "Engineer");
		professionMap.addUserProfession("James", "Doctor");

		assertEquals("Doctor", professionMap.getProfessionByUser("James"));
	}
}
