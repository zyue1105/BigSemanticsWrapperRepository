package ecologylab.semantics.generated.library.publication;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Author.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/15/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * An author of an article or creative work.
 */ 
@simpl_inherit
public class Author extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar @simpl_composite_as_scalar	private MetadataString name;

	/** 
	 */ 
	@simpl_scalar	private MetadataString affiliation;

	/** 
	 */ 
	@simpl_scalar	private MetadataString city;

	public Author()
	{ }

	public Author(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	name()
	{
		MetadataString	result = this.name;
		if (result == null)
		{
			result = new MetadataString();
			this.name = result;
		}
		return result;
	}

	public String getName()
	{
		return this.name().getValue();
	}

	public void setName(String name)
	{
		this.name().setValue(name);
	}

	public MetadataString	affiliation()
	{
		MetadataString	result = this.affiliation;
		if (result == null)
		{
			result = new MetadataString();
			this.affiliation = result;
		}
		return result;
	}

	public String getAffiliation()
	{
		return this.affiliation().getValue();
	}

	public void setAffiliation(String affiliation)
	{
		this.affiliation().setValue(affiliation);
	}

	public MetadataString	city()
	{
		MetadataString	result = this.city;
		if (result == null)
		{
			result = new MetadataString();
			this.city = result;
		}
		return result;
	}

	public String getCity()
	{
		return this.city().getValue();
	}

	public void setCity(String city)
	{
		this.city().setValue(city);
	}

}
