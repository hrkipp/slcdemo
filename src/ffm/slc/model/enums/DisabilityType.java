package ffm.slc.model.enums;

/**
 * A disability condition that describes a child's impairment.
 */
public enum DisabilityType {
	AUTISTIC_AUTISM("Autistic/Autism"),
	DEAF_BLINDNESS("Deaf-Blindness"),
	DEAFNESS("Deafness"),
	DEVELOPMENTAL_DELAY("Developmental Delay"),
	EMOTIONAL_DISTURBANCE("Emotional Disturbance"),
	HEARING_AUDITORY_IMPAIRMENT("Hearing/Auditory Impairment"),
	INFANTS_AND_TODDLERS_WITH_DISABILITIES("Infants and Toddlers with Disabilities"),
	MENTAL_RETARDATION("Mental Retardation"),
	MULTIPLE_DISABILITIES("Multiple Disabilities"),
	ORTHOPEDIC_IMPAIRMENT("Orthopedic Impairment"),
	OTHER_HEALTH_IMPAIRMENT("Other Health Impairment"),
	SPEECH_OR_LANGUAGE_IMPAIRMENT("Speech or Language Impairment"),
	SPECIFIC_LEARNING_DISABILITY("Specific Learning Disability"),
	TRAUMATIC_BRAIN_DELAY("Traumatic Brain Delay"),
	VISUAL_IMPAIRMENT("Visual Impairment");

	private String prettyName;

	DisabilityType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
