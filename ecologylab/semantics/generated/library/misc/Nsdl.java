package ecologylab.semantics.generated.library.misc;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Nsdl.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/15/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The NSDL class
 */ 
@simpl_inherit
public class Nsdl extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	private MetadataString subject;

	public Nsdl()
	{ }

	public Nsdl(MetaMetadataCompositeField mmd) {
		super(mmd);
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
