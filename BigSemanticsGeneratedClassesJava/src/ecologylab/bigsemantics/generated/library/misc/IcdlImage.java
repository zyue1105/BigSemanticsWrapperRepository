package ecologylab.bigsemantics.generated.library.misc;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2014) Interface Ecology Lab.
 */

import ecologylab.bigsemantics.metadata.builtins.Image;
import ecologylab.bigsemantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.bigsemantics.metadata.scalar.MetadataString;
import ecologylab.bigsemantics.metametadata.MetaMetadataCompositeField;
import ecologylab.bigsemantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.lang.String;
import java.util.List;
import java.util.Map;

/** 
 *Image from The Interantional Children's digital library.
 */ 
@simpl_inherit
public class IcdlImage extends Image
{
	/** 
	 *The language of the library
	 */ 
	@simpl_scalar
	private MetadataString languages;

	public IcdlImage()
	{ super(); }

	public IcdlImage(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	languages()
	{
		MetadataString	result = this.languages;
		if (result == null)
		{
			result = new MetadataString();
			this.languages = result;
		}
		return result;
	}

	public String getLanguages()
	{
		return this.languages == null ? null : languages().getValue();
	}

	public MetadataString getLanguagesMetadata()
	{
		return languages;
	}

	public void setLanguages(String languages)
	{
		if (languages != null)
			this.languages().setValue(languages);
	}

	public void setLanguagesMetadata(MetadataString languages)
	{
		this.languages = languages;
	}
}
