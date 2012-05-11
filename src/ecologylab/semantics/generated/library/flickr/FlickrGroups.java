package ecologylab.semantics.generated.library.flickr;

/**
 * Automatically generated by MetaMetadataJavaTranslator
 *
 * DO NOT modify this code manually: All your changes may get lost!
 *
 * Copyright (2012) Interface Ecology Lab.
 */

import ecologylab.semantics.generated.library.flickr.FlickrTag;
import ecologylab.semantics.generated.library.search.Search;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.MetadataBuiltinsTypesScope;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.namesandnums.SemanticsNames;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** 
 *Searching from a photo for nearby photos
 */ 
@simpl_inherit
public class FlickrGroups extends Search<Document>
{
	@simpl_collection("flickr_tag")
	@mm_name("flickr_tags")
	private List<FlickrTag> flickrTags;

	public FlickrGroups()
	{ super(); }

	public FlickrGroups(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrTag> getFlickrTags()
	{
		return flickrTags;
	}

  // lazy evaluation:
  public List<FlickrTag> flickrTags()
  {
    if (flickrTags == null)
      flickrTags = new ArrayList<FlickrTag>();
    return flickrTags;
  }

  // addTo:
  public void addToFlickrTags(FlickrTag element)
  {
    flickrTags().add(element);
  }

  // size:
  public int flickrTagsSize()
  {
    return flickrTags == null ? 0 : flickrTags.size();
  }

	public void setFlickrTags(List<FlickrTag> flickrTags)
	{
		this.flickrTags = flickrTags;
	}
}