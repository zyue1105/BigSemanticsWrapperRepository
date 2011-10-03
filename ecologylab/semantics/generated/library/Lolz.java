package ecologylab.semantics.generated.library;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.net.ParsedURL;
import ecologylab.serialization.annotations.simpl_composite_as_scalar;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Lolz.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/03/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * The LOLZ class
 */ 
@simpl_inherit
public class Lolz extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataString caption;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL picture;

	/** 
	 */ 
	@simpl_scalar	 @simpl_composite_as_scalar
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL mightLike;

	public Lolz()
	{ }

	public Lolz(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	caption()
	{
		MetadataString	result = this.caption;
		if (result == null)
		{
			result = new MetadataString();
			this.caption = result;
		}
		return result;
	}

	public String getCaption()
	{
		return this.caption == null ? null : caption().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getCaptionMetadata()
	{
		return caption;
	}

	public void setCaption(String caption)
	{
		if (caption != null)
			this.caption().setValue(caption);
	}

	public void setCaptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString caption)
	{
		this.caption = caption;
	}

	public MetadataParsedURL	picture()
	{
		MetadataParsedURL	result = this.picture;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.picture = result;
		}
		return result;
	}

	public ParsedURL getPicture()
	{
		return this.picture == null ? null : picture().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getPictureMetadata()
	{
		return picture;
	}

	public void setPicture(ParsedURL picture)
	{
		if (picture != null)
			this.picture().setValue(picture);
	}

	public void setPictureMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL picture)
	{
		this.picture = picture;
	}

	public MetadataParsedURL	mightLike()
	{
		MetadataParsedURL	result = this.mightLike;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.mightLike = result;
		}
		return result;
	}

	public ParsedURL getMightLike()
	{
		return this.mightLike == null ? null : mightLike().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getMightLikeMetadata()
	{
		return mightLike;
	}

	public void setMightLike(ParsedURL mightLike)
	{
		if (mightLike != null)
			this.mightLike().setValue(mightLike);
	}

	public void setMightLikeMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL mightLike)
	{
		this.mightLike = mightLike;
	}
}
