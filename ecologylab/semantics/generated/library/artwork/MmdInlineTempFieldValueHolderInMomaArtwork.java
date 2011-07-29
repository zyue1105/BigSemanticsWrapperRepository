package ecologylab.semantics.generated.library.artwork;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  MmdInlineTempFieldValueHolderInMomaArtwork.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineTempFieldValueHolderInMomaArtwork extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString tempDimensions;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString tempYear;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString tempMedium;

	public MmdInlineTempFieldValueHolderInMomaArtwork()
	{ }

	public MmdInlineTempFieldValueHolderInMomaArtwork(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	tempDimensions()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.tempDimensions;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.tempDimensions = result;
		}
		return result;
	}

	public java.lang.String getTempDimensions()
	{
		return this.tempDimensions == null ? null : tempDimensions().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTempDimensionsMetadata()
	{
		return tempDimensions;
	}

	public void setTempDimensions(java.lang.String tempDimensions)
	{
		if (tempDimensions != null)
			this.tempDimensions().setValue(tempDimensions);
	}

	public void setTempDimensionsMetadata(ecologylab.semantics.metadata.scalar.MetadataString tempDimensions)
	{
		this.tempDimensions = tempDimensions;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	tempYear()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.tempYear;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.tempYear = result;
		}
		return result;
	}

	public java.lang.String getTempYear()
	{
		return this.tempYear == null ? null : tempYear().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTempYearMetadata()
	{
		return tempYear;
	}

	public void setTempYear(java.lang.String tempYear)
	{
		if (tempYear != null)
			this.tempYear().setValue(tempYear);
	}

	public void setTempYearMetadata(ecologylab.semantics.metadata.scalar.MetadataString tempYear)
	{
		this.tempYear = tempYear;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	tempMedium()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.tempMedium;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.tempMedium = result;
		}
		return result;
	}

	public java.lang.String getTempMedium()
	{
		return this.tempMedium == null ? null : tempMedium().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTempMediumMetadata()
	{
		return tempMedium;
	}

	public void setTempMedium(java.lang.String tempMedium)
	{
		if (tempMedium != null)
			this.tempMedium().setValue(tempMedium);
	}

	public void setTempMediumMetadata(ecologylab.semantics.metadata.scalar.MetadataString tempMedium)
	{
		this.tempMedium = tempMedium;
	}
}