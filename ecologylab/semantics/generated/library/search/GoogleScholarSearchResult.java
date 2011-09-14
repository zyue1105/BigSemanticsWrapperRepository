package ecologylab.semantics.generated.library.search;

import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.generated.library.search.SearchResult;

/**
*  GoogleScholarSearchResult.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A google scholar search result
 */ 
@simpl_inherit
public class GoogleScholarSearchResult extends SearchResult
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL documentLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataInteger citations;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL citationsLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL relatedArticlesLink;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataInteger versions;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL versionsLink;

	public GoogleScholarSearchResult()
	{ }

	public GoogleScholarSearchResult(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	documentLink()
	{
		MetadataParsedURL	result = this.documentLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.documentLink = result;
		}
		return result;
	}

	public ParsedURL getDocumentLink()
	{
		return this.documentLink == null ? null : documentLink().getValue();
	}

	public MetadataParsedURL getDocumentLinkMetadata()
	{
		return documentLink;
	}

	public void setDocumentLink(ParsedURL documentLink)
	{
		if (documentLink != null)
			this.documentLink().setValue(documentLink);
	}

	public void setDocumentLinkMetadata(MetadataParsedURL documentLink)
	{
		this.documentLink = documentLink;
	}

	public MetadataInteger	citations()
	{
		MetadataInteger	result = this.citations;
		if (result == null)
		{
			result = new MetadataInteger();
			this.citations = result;
		}
		return result;
	}

	public Integer getCitations()
	{
		return this.citations == null ? 0 : citations().getValue();
	}

	public MetadataInteger getCitationsMetadata()
	{
		return citations;
	}

	public void setCitations(Integer citations)
	{
		if (citations != 0)
			this.citations().setValue(citations);
	}

	public void setCitationsMetadata(MetadataInteger citations)
	{
		this.citations = citations;
	}

	public MetadataParsedURL	citationsLink()
	{
		MetadataParsedURL	result = this.citationsLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.citationsLink = result;
		}
		return result;
	}

	public ParsedURL getCitationsLink()
	{
		return this.citationsLink == null ? null : citationsLink().getValue();
	}

	public MetadataParsedURL getCitationsLinkMetadata()
	{
		return citationsLink;
	}

	public void setCitationsLink(ParsedURL citationsLink)
	{
		if (citationsLink != null)
			this.citationsLink().setValue(citationsLink);
	}

	public void setCitationsLinkMetadata(MetadataParsedURL citationsLink)
	{
		this.citationsLink = citationsLink;
	}

	public MetadataParsedURL	relatedArticlesLink()
	{
		MetadataParsedURL	result = this.relatedArticlesLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.relatedArticlesLink = result;
		}
		return result;
	}

	public ParsedURL getRelatedArticlesLink()
	{
		return this.relatedArticlesLink == null ? null : relatedArticlesLink().getValue();
	}

	public MetadataParsedURL getRelatedArticlesLinkMetadata()
	{
		return relatedArticlesLink;
	}

	public void setRelatedArticlesLink(ParsedURL relatedArticlesLink)
	{
		if (relatedArticlesLink != null)
			this.relatedArticlesLink().setValue(relatedArticlesLink);
	}

	public void setRelatedArticlesLinkMetadata(MetadataParsedURL relatedArticlesLink)
	{
		this.relatedArticlesLink = relatedArticlesLink;
	}

	public MetadataInteger	versions()
	{
		MetadataInteger	result = this.versions;
		if (result == null)
		{
			result = new MetadataInteger();
			this.versions = result;
		}
		return result;
	}

	public Integer getVersions()
	{
		return this.versions == null ? 0 : versions().getValue();
	}

	public MetadataInteger getVersionsMetadata()
	{
		return versions;
	}

	public void setVersions(Integer versions)
	{
		if (versions != 0)
			this.versions().setValue(versions);
	}

	public void setVersionsMetadata(MetadataInteger versions)
	{
		this.versions = versions;
	}

	public MetadataParsedURL	versionsLink()
	{
		MetadataParsedURL	result = this.versionsLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.versionsLink = result;
		}
		return result;
	}

	public ParsedURL getVersionsLink()
	{
		return this.versionsLink == null ? null : versionsLink().getValue();
	}

	public MetadataParsedURL getVersionsLinkMetadata()
	{
		return versionsLink;
	}

	public void setVersionsLink(ParsedURL versionsLink)
	{
		if (versionsLink != null)
			this.versionsLink().setValue(versionsLink);
	}

	public void setVersionsLinkMetadata(MetadataParsedURL versionsLink)
	{
		this.versionsLink = versionsLink;
	}
}
