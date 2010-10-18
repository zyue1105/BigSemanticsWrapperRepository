package ecologylab.semantics.generated.library.bibManaging;

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
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	CiteSeerX record for an article.
**/ 

@simpl_inherit

public class  CiteseerxRecord
extends  ScholarlyArticle
{


/**
	Author list, in a line. CiteSeerX doesn't allow you to navigate by author.
**/ 

	@simpl_scalar private MetadataString	authorList;

/**
	Number of total citations.
**/ 

	@simpl_scalar private MetadataInteger	totalCitation;

/**
	Number of self citations.
**/ 

	@simpl_scalar private MetadataInteger	selfCitation;

/**
	Constructor
**/ 

public CiteseerxRecord()
{
 super();
}

/**
	Constructor
**/ 

public CiteseerxRecord(MetaMetadataCompositeField metaMetadata)
{
super(metaMetadata);
}

/**
	Lazy Evaluation for authorList
**/ 

public MetadataString	authorList()
{
MetadataString	result	=this.authorList;
if(result == null)
{
result = new MetadataString();
this.authorList	=	 result;
}
return result;
}

/**
	Gets the value of the field authorList
**/ 

public String getAuthorList()
{
	return authorList().getValue();
}

/**
	Sets the value of the field authorList
**/ 

public void setAuthorList( String authorList )
{
	this.authorList().setValue(authorList);
}

/**
	The heavy weight setter method for field authorList
**/ 

public void hwSetAuthorList( String authorList )
{
	this.authorList().setValue(authorList);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: authorList
**/ 

public boolean isNullAuthorList()
{
	return authorList == null || authorList.getValue() == null;
}

/**
	 Sets the authorList directly
**/ 

public void setAuthorListMetadata(MetadataString authorList)
{	this.authorList = authorList;
}
/**
	Heavy Weight Direct setter method for authorList
**/ 

public void hwSetAuthorListMetadata(MetadataString authorList)
{	 if(this.authorList!=null && this.authorList.getValue()!=null && hasTermVector())
		 termVector().remove(this.authorList.termVector());
	 this.authorList = authorList;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for totalCitation
**/ 

public MetadataInteger	totalCitation()
{
MetadataInteger	result	=this.totalCitation;
if(result == null)
{
result = new MetadataInteger();
this.totalCitation	=	 result;
}
return result;
}

/**
	Gets the value of the field totalCitation
**/ 

public Integer getTotalCitation()
{
	return totalCitation().getValue();
}

/**
	Sets the value of the field totalCitation
**/ 

public void setTotalCitation( Integer totalCitation )
{
	this.totalCitation().setValue(totalCitation);
}

/**
	The heavy weight setter method for field totalCitation
**/ 

public void hwSetTotalCitation( Integer totalCitation )
{
	this.totalCitation().setValue(totalCitation);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: totalCitation
**/ 

public boolean isNullTotalCitation()
{
	return totalCitation == null || totalCitation.getValue() == null;
}

/**
	 Sets the totalCitation directly
**/ 

public void setTotalCitationMetadata(MetadataInteger totalCitation)
{	this.totalCitation = totalCitation;
}
/**
	Heavy Weight Direct setter method for totalCitation
**/ 

public void hwSetTotalCitationMetadata(MetadataInteger totalCitation)
{	 if(this.totalCitation!=null && this.totalCitation.getValue()!=null && hasTermVector())
		 termVector().remove(this.totalCitation.termVector());
	 this.totalCitation = totalCitation;
	rebuildCompositeTermVector();
}
/**
	Lazy Evaluation for selfCitation
**/ 

public MetadataInteger	selfCitation()
{
MetadataInteger	result	=this.selfCitation;
if(result == null)
{
result = new MetadataInteger();
this.selfCitation	=	 result;
}
return result;
}

/**
	Gets the value of the field selfCitation
**/ 

public Integer getSelfCitation()
{
	return selfCitation().getValue();
}

/**
	Sets the value of the field selfCitation
**/ 

public void setSelfCitation( Integer selfCitation )
{
	this.selfCitation().setValue(selfCitation);
}

/**
	The heavy weight setter method for field selfCitation
**/ 

public void hwSetSelfCitation( Integer selfCitation )
{
	this.selfCitation().setValue(selfCitation);
	rebuildCompositeTermVector();
}
/**
	Tests to see if the value of the field is null, or if the field itself is null: selfCitation
**/ 

public boolean isNullSelfCitation()
{
	return selfCitation == null || selfCitation.getValue() == null;
}

/**
	 Sets the selfCitation directly
**/ 

public void setSelfCitationMetadata(MetadataInteger selfCitation)
{	this.selfCitation = selfCitation;
}
/**
	Heavy Weight Direct setter method for selfCitation
**/ 

public void hwSetSelfCitationMetadata(MetadataInteger selfCitation)
{	 if(this.selfCitation!=null && this.selfCitation.getValue()!=null && hasTermVector())
		 termVector().remove(this.selfCitation.termVector());
	 this.selfCitation = selfCitation;
	rebuildCompositeTermVector();
}
}

