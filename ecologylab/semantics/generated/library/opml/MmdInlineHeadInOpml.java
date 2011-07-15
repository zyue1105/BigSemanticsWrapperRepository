package ecologylab.semantics.generated.library.opml;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  MmdInlineHeadInOpml.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/15/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineHeadInOpml extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString title;

	public MmdInlineHeadInOpml()
	{ }

	public MmdInlineHeadInOpml(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	title()
	{
		MetadataString	result = this.title;
		if (result == null)
		{
			result = new MetadataString();
			this.title = result;
		}
		return result;
	}

	public String getTitle()
	{
		return this.title().getValue();
	}

	public void setTitle(String title)
	{
		this.title().setValue(title);
	}

}
