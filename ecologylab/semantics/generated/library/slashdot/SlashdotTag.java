package ecologylab.semantics.generated.library.slashdot;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  SlashdotTag.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class SlashdotTag extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString name;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL link;

	public SlashdotTag()
	{ }

	public SlashdotTag(MetaMetadataCompositeField mmd) {
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
		return this.name == null ? null : name().getValue();
	}

	public MetadataString getNameMetadata()
	{
		return name;
	}

	public void setName(String name)
	{
		if (name != null)
			this.name().setValue(name);
	}

	public void setNameMetadata(MetadataString name)
	{
		this.name = name;
	}

	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(MetadataParsedURL link)
	{
		this.link = link;
	}
}
