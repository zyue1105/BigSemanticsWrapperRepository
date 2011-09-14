package ecologylab.semantics.generated.library.search;

import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  YahooThumbnail.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class YahooThumbnail extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	@xml_tag("Url")	@simpl_hints(Hint.XML_LEAF)	
	private MetadataParsedURL thumbUrl;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("Width")	@simpl_hints(Hint.XML_LEAF)	
	private MetadataInteger width;

	/** 
	 */ 
	@simpl_scalar	@xml_tag("Height")	@simpl_hints(Hint.XML_LEAF)	
	private MetadataInteger height;

	public YahooThumbnail()
	{ }

	public YahooThumbnail(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	thumbUrl()
	{
		MetadataParsedURL	result = this.thumbUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.thumbUrl = result;
		}
		return result;
	}

	public ParsedURL getThumbUrl()
	{
		return this.thumbUrl == null ? null : thumbUrl().getValue();
	}

	public MetadataParsedURL getThumbUrlMetadata()
	{
		return thumbUrl;
	}

	public void setThumbUrl(ParsedURL thumbUrl)
	{
		if (thumbUrl != null)
			this.thumbUrl().setValue(thumbUrl);
	}

	public void setThumbUrlMetadata(MetadataParsedURL thumbUrl)
	{
		this.thumbUrl = thumbUrl;
	}

	public MetadataInteger	width()
	{
		MetadataInteger	result = this.width;
		if (result == null)
		{
			result = new MetadataInteger();
			this.width = result;
		}
		return result;
	}

	public Integer getWidth()
	{
		return this.width == null ? 0 : width().getValue();
	}

	public MetadataInteger getWidthMetadata()
	{
		return width;
	}

	public void setWidth(Integer width)
	{
		if (width != 0)
			this.width().setValue(width);
	}

	public void setWidthMetadata(MetadataInteger width)
	{
		this.width = width;
	}

	public MetadataInteger	height()
	{
		MetadataInteger	result = this.height;
		if (result == null)
		{
			result = new MetadataInteger();
			this.height = result;
		}
		return result;
	}

	public Integer getHeight()
	{
		return this.height == null ? 0 : height().getValue();
	}

	public MetadataInteger getHeightMetadata()
	{
		return height;
	}

	public void setHeight(Integer height)
	{
		if (height != 0)
			this.height().setValue(height);
	}

	public void setHeightMetadata(MetadataInteger height)
	{
		this.height = height;
	}
}
