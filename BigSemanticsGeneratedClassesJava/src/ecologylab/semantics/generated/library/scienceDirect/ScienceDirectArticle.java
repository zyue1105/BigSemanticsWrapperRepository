package ecologylab.semantics.generated.library.scienceDirect;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2013) Interface Ecology Lab.
 */

import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.scholarlyArticle.ScholarlyArticle;
import ecologylab.semantics.generated.library.scienceDirect.ScopusSearch;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;
import java.util.List;
import java.util.Map;

/** 
 *Information about the article
 */ 
@simpl_inherit
public class ScienceDirectArticle extends ScholarlyArticle
{
	@simpl_composite
	@mm_name("citations_page")
	private ScopusSearch citationsPage;

	/** 
	 *The digital object identifier of the article
	 */ 
	@simpl_scalar
	private MetadataParsedURL doi;

	public ScienceDirectArticle()
	{ super(); }

	public ScienceDirectArticle(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ScopusSearch getCitationsPage()
	{
		return citationsPage;
	}

	public void setCitationsPage(ScopusSearch citationsPage)
	{
		this.citationsPage = citationsPage;
	}

	public MetadataParsedURL	doi()
	{
		MetadataParsedURL	result = this.doi;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.doi = result;
		}
		return result;
	}

	public ParsedURL getDoi()
	{
		return this.doi == null ? null : doi().getValue();
	}

	public MetadataParsedURL getDoiMetadata()
	{
		return doi;
	}

	public void setDoi(ParsedURL doi)
	{
		if (doi != null)
			this.doi().setValue(doi);
	}

	public void setDoiMetadata(MetadataParsedURL doi)
	{
		this.doi = doi;
	}
}