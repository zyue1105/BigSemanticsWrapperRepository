package ecologylab.bigsemantics.test.library.generics;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.bigsemantics.test.library.generics.GeneralSearch;
import ecologylab.bigsemantics.test.library.generics.SocialMediaSearchResultForTest;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SocialMediaSearchTwo<SR extends SocialMediaSearchResultForTest> extends GeneralSearch<SR>
{
	public SocialMediaSearchTwo()
	{ super(); }

	public SocialMediaSearchTwo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

}
