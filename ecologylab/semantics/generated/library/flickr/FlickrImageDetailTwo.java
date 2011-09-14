package ecologylab.semantics.generated.library.flickr;

import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import java.util.List;
import ecologylab.semantics.metadata.builtins.CompoundDocument;
import ecologylab.semantics.generated.library.flickr.AuthorPhotos;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.flickr.FlickrTag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;

/**
*  FlickrImageDetailTwo.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * A Flickr Image result page
 */ 
@simpl_inherit
public class FlickrImageDetailTwo extends CompoundDocument
{
	/** 
	 */ 
	@simpl_scalar	
	private MetadataString views;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataString place;

	/** 
	 */ 
	@simpl_scalar	
	private MetadataParsedURL placeLink;

	/** 
	 */ 
	@simpl_collection("flickr_tag")	@mm_name("flickr_tags")
	private List<FlickrTag> flickrTags;

	/** 
	 */ 
	@simpl_composite	@mm_name("author_photos")
	private AuthorPhotos authorPhotos;

	public FlickrImageDetailTwo()
	{ }

	public FlickrImageDetailTwo(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	views()
	{
		MetadataString	result = this.views;
		if (result == null)
		{
			result = new MetadataString();
			this.views = result;
		}
		return result;
	}

	public String getViews()
	{
		return this.views == null ? null : views().getValue();
	}

	public MetadataString getViewsMetadata()
	{
		return views;
	}

	public void setViews(String views)
	{
		if (views != null)
			this.views().setValue(views);
	}

	public void setViewsMetadata(MetadataString views)
	{
		this.views = views;
	}

	public MetadataString	place()
	{
		MetadataString	result = this.place;
		if (result == null)
		{
			result = new MetadataString();
			this.place = result;
		}
		return result;
	}

	public String getPlace()
	{
		return this.place == null ? null : place().getValue();
	}

	public MetadataString getPlaceMetadata()
	{
		return place;
	}

	public void setPlace(String place)
	{
		if (place != null)
			this.place().setValue(place);
	}

	public void setPlaceMetadata(MetadataString place)
	{
		this.place = place;
	}

	public MetadataParsedURL	placeLink()
	{
		MetadataParsedURL	result = this.placeLink;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.placeLink = result;
		}
		return result;
	}

	public ParsedURL getPlaceLink()
	{
		return this.placeLink == null ? null : placeLink().getValue();
	}

	public MetadataParsedURL getPlaceLinkMetadata()
	{
		return placeLink;
	}

	public void setPlaceLink(ParsedURL placeLink)
	{
		if (placeLink != null)
			this.placeLink().setValue(placeLink);
	}

	public void setPlaceLinkMetadata(MetadataParsedURL placeLink)
	{
		this.placeLink = placeLink;
	}

	public List<FlickrTag> getFlickrTags()
	{
		return flickrTags;
	}

	public void setFlickrTags(List<FlickrTag> flickrTags)
	{
		this.flickrTags = flickrTags;
	}

	public AuthorPhotos getAuthorPhotos()
	{
		return authorPhotos;
	}

	public void setAuthorPhotos(AuthorPhotos authorPhotos)
	{
		this.authorPhotos = authorPhotos;
	}
}
