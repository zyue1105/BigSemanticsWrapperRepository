package ecologylab.semantics.generated.library.imdb;

/**
This is a generated code. DO NOT edit or modify it.
 @author MetadataCompiler 

**/ 



import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.dreamHouse.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.ClippableDocument;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	Metadata for storing details of birth (date and place) of people
**/ 

@simpl_inherit

public class  BirthDetail
extends  Document
{

	@simpl_scalar private MetadataString	dayOfBirth;
	@simpl_scalar private MetadataString	yearOfBirth;
	@simpl_scalar private MetadataString	placeOfBirth;
	@simpl_scalar private MetadataParsedURL	dayOfBirthLink;
	@simpl_scalar private MetadataParsedURL	yearOfBirthLink;
	@simpl_scalar private MetadataParsedURL	placeOfBirthLink;

/**
	Constructor
**/ 

public BirthDetail()
{
 super();
}

/**
	Constructor
**/ 

public BirthDetail(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for dayOfBirth
**/ 

public MetadataString	dayOfBirth()
{
MetadataString	result	=this.dayOfBirth;
if(result == null)
{
result = new MetadataString();
this.dayOfBirth	=	 result;
}
return result;
}

/**
	Gets the value of the field dayOfBirth
**/ 

public String getDayOfBirth()
{
	return dayOfBirth().getValue();
}

/**
	Sets the value of the field dayOfBirth
**/ 

public void setDayOfBirth( String dayOfBirth )
{
	this.dayOfBirth().setValue(dayOfBirth);
}

/**
	The heavy weight setter method for field dayOfBirth
**/ 

public void hwSetDayOfBirth( String dayOfBirth )
{
	this.dayOfBirth().setValue(dayOfBirth);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: dayOfBirth
**/ 

public boolean isNullDayOfBirth()
{
	return dayOfBirth == null || dayOfBirth.getValue() == null;
}

/**
	 Sets the dayOfBirth directly
**/ 

public void setDayOfBirthMetadata(MetadataString dayOfBirth)
{	this.dayOfBirth = dayOfBirth;
}
/**
	Heavy Weight Direct setter method for dayOfBirth
**/ 

public void hwSetDayOfBirthMetadata(MetadataString dayOfBirth)
{	 if(this.dayOfBirth!=null && this.dayOfBirth.getValue()!=null && hasTermVector())
		 termVector().remove(this.dayOfBirth.termVector());
	 this.dayOfBirth = dayOfBirth;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for yearOfBirth
**/ 

public MetadataString	yearOfBirth()
{
MetadataString	result	=this.yearOfBirth;
if(result == null)
{
result = new MetadataString();
this.yearOfBirth	=	 result;
}
return result;
}

/**
	Gets the value of the field yearOfBirth
**/ 

public String getYearOfBirth()
{
	return yearOfBirth().getValue();
}

/**
	Sets the value of the field yearOfBirth
**/ 

public void setYearOfBirth( String yearOfBirth )
{
	this.yearOfBirth().setValue(yearOfBirth);
}

/**
	The heavy weight setter method for field yearOfBirth
**/ 

public void hwSetYearOfBirth( String yearOfBirth )
{
	this.yearOfBirth().setValue(yearOfBirth);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: yearOfBirth
**/ 

public boolean isNullYearOfBirth()
{
	return yearOfBirth == null || yearOfBirth.getValue() == null;
}

/**
	 Sets the yearOfBirth directly
**/ 

public void setYearOfBirthMetadata(MetadataString yearOfBirth)
{	this.yearOfBirth = yearOfBirth;
}
/**
	Heavy Weight Direct setter method for yearOfBirth
**/ 

public void hwSetYearOfBirthMetadata(MetadataString yearOfBirth)
{	 if(this.yearOfBirth!=null && this.yearOfBirth.getValue()!=null && hasTermVector())
		 termVector().remove(this.yearOfBirth.termVector());
	 this.yearOfBirth = yearOfBirth;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for placeOfBirth
**/ 

public MetadataString	placeOfBirth()
{
MetadataString	result	=this.placeOfBirth;
if(result == null)
{
result = new MetadataString();
this.placeOfBirth	=	 result;
}
return result;
}

/**
	Gets the value of the field placeOfBirth
**/ 

public String getPlaceOfBirth()
{
	return placeOfBirth().getValue();
}

/**
	Sets the value of the field placeOfBirth
**/ 

public void setPlaceOfBirth( String placeOfBirth )
{
	this.placeOfBirth().setValue(placeOfBirth);
}

/**
	The heavy weight setter method for field placeOfBirth
**/ 

public void hwSetPlaceOfBirth( String placeOfBirth )
{
	this.placeOfBirth().setValue(placeOfBirth);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: placeOfBirth
**/ 

public boolean isNullPlaceOfBirth()
{
	return placeOfBirth == null || placeOfBirth.getValue() == null;
}

/**
	 Sets the placeOfBirth directly
**/ 

public void setPlaceOfBirthMetadata(MetadataString placeOfBirth)
{	this.placeOfBirth = placeOfBirth;
}
/**
	Heavy Weight Direct setter method for placeOfBirth
**/ 

public void hwSetPlaceOfBirthMetadata(MetadataString placeOfBirth)
{	 if(this.placeOfBirth!=null && this.placeOfBirth.getValue()!=null && hasTermVector())
		 termVector().remove(this.placeOfBirth.termVector());
	 this.placeOfBirth = placeOfBirth;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for dayOfBirthLink
**/ 

public MetadataParsedURL	dayOfBirthLink()
{
MetadataParsedURL	result	=this.dayOfBirthLink;
if(result == null)
{
result = new MetadataParsedURL();
this.dayOfBirthLink	=	 result;
}
return result;
}

/**
	Gets the value of the field dayOfBirthLink
**/ 

public ParsedURL getDayOfBirthLink()
{
	return dayOfBirthLink().getValue();
}

/**
	Sets the value of the field dayOfBirthLink
**/ 

public void setDayOfBirthLink( ParsedURL dayOfBirthLink )
{
	this.dayOfBirthLink().setValue(dayOfBirthLink);
}

/**
	The heavy weight setter method for field dayOfBirthLink
**/ 

public void hwSetDayOfBirthLink( ParsedURL dayOfBirthLink )
{
	this.dayOfBirthLink().setValue(dayOfBirthLink);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: dayOfBirthLink
**/ 

public boolean isNullDayOfBirthLink()
{
	return dayOfBirthLink == null || dayOfBirthLink.getValue() == null;
}

/**
	 Sets the dayOfBirthLink directly
**/ 

public void setDayOfBirthLinkMetadata(MetadataParsedURL dayOfBirthLink)
{	this.dayOfBirthLink = dayOfBirthLink;
}
/**
	Heavy Weight Direct setter method for dayOfBirthLink
**/ 

public void hwSetDayOfBirthLinkMetadata(MetadataParsedURL dayOfBirthLink)
{	 if(this.dayOfBirthLink!=null && this.dayOfBirthLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.dayOfBirthLink.termVector());
	 this.dayOfBirthLink = dayOfBirthLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for yearOfBirthLink
**/ 

public MetadataParsedURL	yearOfBirthLink()
{
MetadataParsedURL	result	=this.yearOfBirthLink;
if(result == null)
{
result = new MetadataParsedURL();
this.yearOfBirthLink	=	 result;
}
return result;
}

/**
	Gets the value of the field yearOfBirthLink
**/ 

public ParsedURL getYearOfBirthLink()
{
	return yearOfBirthLink().getValue();
}

/**
	Sets the value of the field yearOfBirthLink
**/ 

public void setYearOfBirthLink( ParsedURL yearOfBirthLink )
{
	this.yearOfBirthLink().setValue(yearOfBirthLink);
}

/**
	The heavy weight setter method for field yearOfBirthLink
**/ 

public void hwSetYearOfBirthLink( ParsedURL yearOfBirthLink )
{
	this.yearOfBirthLink().setValue(yearOfBirthLink);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: yearOfBirthLink
**/ 

public boolean isNullYearOfBirthLink()
{
	return yearOfBirthLink == null || yearOfBirthLink.getValue() == null;
}

/**
	 Sets the yearOfBirthLink directly
**/ 

public void setYearOfBirthLinkMetadata(MetadataParsedURL yearOfBirthLink)
{	this.yearOfBirthLink = yearOfBirthLink;
}
/**
	Heavy Weight Direct setter method for yearOfBirthLink
**/ 

public void hwSetYearOfBirthLinkMetadata(MetadataParsedURL yearOfBirthLink)
{	 if(this.yearOfBirthLink!=null && this.yearOfBirthLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.yearOfBirthLink.termVector());
	 this.yearOfBirthLink = yearOfBirthLink;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for placeOfBirthLink
**/ 

public MetadataParsedURL	placeOfBirthLink()
{
MetadataParsedURL	result	=this.placeOfBirthLink;
if(result == null)
{
result = new MetadataParsedURL();
this.placeOfBirthLink	=	 result;
}
return result;
}

/**
	Gets the value of the field placeOfBirthLink
**/ 

public ParsedURL getPlaceOfBirthLink()
{
	return placeOfBirthLink().getValue();
}

/**
	Sets the value of the field placeOfBirthLink
**/ 

public void setPlaceOfBirthLink( ParsedURL placeOfBirthLink )
{
	this.placeOfBirthLink().setValue(placeOfBirthLink);
}

/**
	The heavy weight setter method for field placeOfBirthLink
**/ 

public void hwSetPlaceOfBirthLink( ParsedURL placeOfBirthLink )
{
	this.placeOfBirthLink().setValue(placeOfBirthLink);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: placeOfBirthLink
**/ 

public boolean isNullPlaceOfBirthLink()
{
	return placeOfBirthLink == null || placeOfBirthLink.getValue() == null;
}

/**
	 Sets the placeOfBirthLink directly
**/ 

public void setPlaceOfBirthLinkMetadata(MetadataParsedURL placeOfBirthLink)
{	this.placeOfBirthLink = placeOfBirthLink;
}
/**
	Heavy Weight Direct setter method for placeOfBirthLink
**/ 

public void hwSetPlaceOfBirthLinkMetadata(MetadataParsedURL placeOfBirthLink)
{	 if(this.placeOfBirthLink!=null && this.placeOfBirthLink.getValue()!=null && hasTermVector())
		 termVector().remove(this.placeOfBirthLink.termVector());
	 this.placeOfBirthLink = placeOfBirthLink;
	rebuildCompositeTermVector();
}
}

