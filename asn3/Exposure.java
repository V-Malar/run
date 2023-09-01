package asn3;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

public class Exposure  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3303603846317686793L;
	UUID patientId;
	LocalDateTime dateTime;
	String exposureType;

	public Exposure(UUID patientId) {
		this.patientId = patientId;
	}

	public UUID getPatientId() {
		return patientId;
	}

	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getExposureType() {
		return exposureType;
	}

	public void setExposureType(String exposureType) {
		if (!Pattern.matches("[DI]", exposureType)) {
			throw new IllegalArgumentException("Value must be either D or I");
		} else {
			this.exposureType = exposureType;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateTime, exposureType, patientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exposure other = (Exposure) obj;
		return Objects.equals(dateTime, other.dateTime) || Objects.equals(exposureType, other.exposureType)
				|| Objects.equals(patientId, other.patientId);
	}

	@Override
	public String toString() {
		return "Exposure [patientId=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}
}
