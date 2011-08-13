package ecologylab.semantics.generated.library.scholarlyPublication;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.library.search.SearchResult;

/**
*  AcmPortalSearchResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/12/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class AcmPortalSearchResult extends SearchResult
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString authorList;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString publication;

	public AcmPortalSearchResult()
	{ }

	public AcmPortalSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	authorList()
	{
		MetadataString	result = this.authorList;
		if (result == null)
		{
			result = new MetadataString();
			this.authorList = result;
		}
		return result;
	}

	public String getAuthorList()
	{
		return this.authorList == null ? null : authorList().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getAuthorListMetadata()
	{
		return authorList;
	}

	public void setAuthorList(String authorList)
	{
		if (authorList != null)
			this.authorList().setValue(authorList);
	}

	public void setAuthorListMetadata(ecologylab.semantics.metadata.scalar.MetadataString authorList)
	{
		this.authorList = authorList;
	}

	public MetadataString	publication()
	{
		MetadataString	result = this.publication;
		if (result == null)
		{
			result = new MetadataString();
			this.publication = result;
		}
		return result;
	}

	public String getPublication()
	{
		return this.publication == null ? null : publication().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPublicationMetadata()
	{
		return publication;
	}

	public void setPublication(String publication)
	{
		if (publication != null)
			this.publication().setValue(publication);
	}

	public void setPublicationMetadata(ecologylab.semantics.metadata.scalar.MetadataString publication)
	{
		this.publication = publication;
	}
}
