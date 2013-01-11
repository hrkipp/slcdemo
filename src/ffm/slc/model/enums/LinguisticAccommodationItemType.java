package ffm.slc.model.enums;

/**
 * The item(s) denoting the linguistic accommodations used with the student for the test. For example: Bilingual dictionary English dictonary Reading Aloud - Word or Phrase Reading Aloud - Entire Test Item Oral Translation - Word or phrase Clarification - Word or phrase
 */
public enum LinguisticAccommodationItemType {
	BILINGUAL_DICTIONARY("Bilingual Dictionary"),
	ENGLISH_DICTIONARY("English Dictionary"),
	READING_ALOUD_WORD_OR_PHRASE("Reading Aloud - Word or Phrase"),
	READING_ALOUD_ENTIRE_TEST_ITEM("Reading Aloud - Entire Test Item"),
	ORAL_TRANSLATION_WORD_OR_PHRASE("Oral Translation - Word or Phrase"),
	CLARIFICATION_WORD_OR_PHRASE("Clarification - Word or Phrase"),
	LINGUISTIC_ACCOMMODATIONS_ALLOWED_BUT_NOT_USED("Linguistic Accommodations allowed but not used"),
	LINGUISTIC_SIMPLIFICATION("Linguistic Simplification"),
	READING_ASSISTANCE("Reading Assistance"),
	BILINGUAL_GLOSSARY("Bilingual Glossary"),
	ENGLISH_AND_SPANISH_TESTS_SIDE_BY_SIDE("English and Spanish tests side-by-side");

	private String prettyName;

	LinguisticAccommodationItemType(String prettyName) {
		this.prettyName = prettyName;
	}

	@Override
	public String toString() {
		return prettyName;
	}
}
