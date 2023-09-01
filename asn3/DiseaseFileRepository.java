package asn3;

//import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * A class for saving and initializing Disease and Patient data to/from files.
 */

public class DiseaseFileRepository {
	/**
	 * Save an array of diseases and an array of patients to files.
	 *
	 * @param diseases An array of diseases to save.
	 * @param patients An array of patients to save.
	 * @throws IOException            If an I/O error occurs while saving the data.
	 * @throws ClassNotFoundException If the class of a serialized object cannot be
	 *                                found during deserialization.
	 */
	public static void save(Disease[] diseases, Patient[] patients) throws IOException, ClassNotFoundException {
		String folderPath = "D:\\CPS\\LWUG\\workspace\\project1\\";
		File file = new File(folderPath, "Diseases.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(diseases);

		file = new File(folderPath, "Patients.dat");
		fos = new FileOutputStream(file);
		oos = new ObjectOutputStream(fos);
		oos.writeObject(patients);
		DiseaseFileRepository.init(folderPath);
	}

	/**
	 * Initialize Disease and Patient data from files.
	 *
	 * @param folderPath The path to the folder containing the data files.
	 * @return A DiseaseAndPatient object containing initialized data.
	 * @throws IOException            If an I/O error occurs while reading the data
	 *                                files.
	 * @throws ClassNotFoundException If the class of a serialized object cannot be
	 *                                found during deserialization.
	 */
	public static DiseaseAndPatient init(String folderPath) throws IOException, ClassNotFoundException {
		if (folderPath == null) {
			throw new IllegalArgumentException();
		}
		FileInputStream fis = new FileInputStream(folderPath + "patients.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		DiseaseAndPatient diseases_and_patients = new DiseaseAndPatient();
		diseases_and_patients.setPatients((Patient[]) ois.readObject());
		fis = new FileInputStream(folderPath + "diseases.dat");
		ois = new ObjectInputStream(fis);
		diseases_and_patients.setDiseases((Disease[]) ois.readObject());
		return diseases_and_patients;
	}
}
