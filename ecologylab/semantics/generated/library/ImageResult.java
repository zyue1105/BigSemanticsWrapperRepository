package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  ImageResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/03/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class ImageResult extends Metadata
{
	/** 
	 * image summary
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString summary;

	/** 
	 * raw parsed URL for extracting values 'url', 'referer_url'
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL imgUrl;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString imgSimilarUrl;

	/** 
	 * mime type should be extracted from this property
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString rawProperty;

	/** 
	 * image title
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString imgTitle;

	public ImageResult()
	{ }

	public ImageResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	summary()
	{
		MetadataString	result = this.summary;
		if (result == null)
		{
			result = new MetadataString();
			this.summary = result;
		}
		return result;
	}

	public String getSummary()
	{
		return this.summary == null ? null : summary().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getSummaryMetadata()
	{
		return summary;
	}

	public void setSummary(String summary)
	{
		if (summary != null)
			this.summary().setValue(summary);
	}

	public void setSummaryMetadata(ecologylab.semantics.metadata.scalar.MetadataString summary)
	{
		this.summary = summary;
	}

	public MetadataParsedURL	imgUrl()
	{
		MetadataParsedURL	result = this.imgUrl;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.imgUrl = result;
		}
		return result;
	}

	public ParsedURL getImgUrl()
	{
		return this.imgUrl == null ? null : imgUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getImgUrlMetadata()
	{
		return imgUrl;
	}

	public void setImgUrl(ParsedURL imgUrl)
	{
		if (imgUrl != null)
			this.imgUrl().setValue(imgUrl);
	}

	public void setImgUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL imgUrl)
	{
		this.imgUrl = imgUrl;
	}

	public MetadataString	imgSimilarUrl()
	{
		MetadataString	result = this.imgSimilarUrl;
		if (result == null)
		{
			result = new MetadataString();
			this.imgSimilarUrl = result;
		}
		return result;
	}

	public String getImgSimilarUrl()
	{
		return this.imgSimilarUrl == null ? null : imgSimilarUrl().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getImgSimilarUrlMetadata()
	{
		return imgSimilarUrl;
	}

	public void setImgSimilarUrl(String imgSimilarUrl)
	{
		if (imgSimilarUrl != null)
			this.imgSimilarUrl().setValue(imgSimilarUrl);
	}

	public void setImgSimilarUrlMetadata(ecologylab.semantics.metadata.scalar.MetadataString imgSimilarUrl)
	{
		this.imgSimilarUrl = imgSimilarUrl;
	}

	public MetadataString	rawProperty()
	{
		MetadataString	result = this.rawProperty;
		if (result == null)
		{
			result = new MetadataString();
			this.rawProperty = result;
		}
		return result;
	}

	public String getRawProperty()
	{
		return this.rawProperty == null ? null : rawProperty().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getRawPropertyMetadata()
	{
		return rawProperty;
	}

	public void setRawProperty(String rawProperty)
	{
		if (rawProperty != null)
			this.rawProperty().setValue(rawProperty);
	}

	public void setRawPropertyMetadata(ecologylab.semantics.metadata.scalar.MetadataString rawProperty)
	{
		this.rawProperty = rawProperty;
	}

	public MetadataString	imgTitle()
	{
		MetadataString	result = this.imgTitle;
		if (result == null)
		{
			result = new MetadataString();
			this.imgTitle = result;
		}
		return result;
	}

	public String getImgTitle()
	{
		return this.imgTitle == null ? null : imgTitle().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getImgTitleMetadata()
	{
		return imgTitle;
	}

	public void setImgTitle(String imgTitle)
	{
		if (imgTitle != null)
			this.imgTitle().setValue(imgTitle);
	}

	public void setImgTitleMetadata(ecologylab.semantics.metadata.scalar.MetadataString imgTitle)
	{
		this.imgTitle = imgTitle;
	}
}
