package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  Bookmark.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/27/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Bookmark extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString title;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL link;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL pic;

	public Bookmark()
	{ }

	public Bookmark(MetaMetadataCompositeField mmd) {
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
		return this.title == null ? null : title().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTitleMetadata()
	{
		return title;
	}

	public void setTitle(String title)
	{
		if (title != null)
			this.title().setValue(title);
	}

	public void setTitleMetadata(ecologylab.semantics.metadata.scalar.MetadataString title)
	{
		this.title = title;
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

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL link)
	{
		this.link = link;
	}

	public MetadataParsedURL	pic()
	{
		MetadataParsedURL	result = this.pic;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.pic = result;
		}
		return result;
	}

	public ParsedURL getPic()
	{
		return this.pic == null ? null : pic().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPicMetadata()
	{
		return pic;
	}

	public void setPic(ParsedURL pic)
	{
		if (pic != null)
			this.pic().setValue(pic);
	}

	public void setPicMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL pic)
	{
		this.pic = pic;
	}
}
