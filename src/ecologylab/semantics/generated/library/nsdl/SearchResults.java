package ecologylab.semantics.generated.library.nsdl;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.nsdl.NsdlDocument;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTranslationScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@simpl_inherit
public class SearchResults extends Metadata
{
	@simpl_collection("nsdl_document")
	@mm_name("results")
	private List<NsdlDocument> results;

	public SearchResults()
	{ }

	public SearchResults(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<NsdlDocument> getResults()
	{
		return results;
	}

	public void setResults(List<NsdlDocument> results)
	{
		this.results = results;
	}
}