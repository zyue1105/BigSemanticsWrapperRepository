package ecologylab.semantics.generated.library.flickr;

import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.flickr.FlickrLink;
import ecologylab.serialization.annotations.simpl_collection;

/**
*  FlickrAuthor.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 10/03/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * All flickr photos of a particular user
 */ 
@simpl_inherit
public class FlickrAuthor extends CompoundDocument
{
	/** 
	 * Collection of all images of a user
	 */ 
	@simpl_collection("flickr_link")	@mm_name("flickr_link_set")
	private List<FlickrLink> flickrLinkSet;

	public FlickrAuthor()
	{ }

	public FlickrAuthor(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<FlickrLink> getFlickrLinkSet()
	{
		return flickrLinkSet;
	}

	public void setFlickrLinkSet(List<FlickrLink> flickrLinkSet)
	{
		this.flickrLinkSet = flickrLinkSet;
	}
}
