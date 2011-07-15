package ecologylab.semantics.generated.library.publication;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  MmdInlineSubjectInSubjectsInPublication.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/15/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineSubjectInSubjectsInPublication extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL location;

	/** 
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private MetadataString subject;

	public MmdInlineSubjectInSubjectsInPublication()
	{ }

	public MmdInlineSubjectInSubjectsInPublication(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataParsedURL	location()
	{
		MetadataParsedURL	result = this.location;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.location = result;
		}
		return result;
	}

	public ParsedURL getLocation()
	{
		return this.location().getValue();
	}

	public void setLocation(ParsedURL location)
	{
		this.location().setValue(location);
	}

	public MetadataString	subject()
	{
		MetadataString	result = this.subject;
		if (result == null)
		{
			result = new MetadataString();
			this.subject = result;
		}
		return result;
	}

	public String getSubject()
	{
		return this.subject().getValue();
	}

	public void setSubject(String subject)
	{
		this.subject().setValue(subject);
	}

}
