//
// GooglePatent.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 11/07/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Fundamental.Net;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.patents;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.patents 
{
	/// <summary>
	/// Google Patents Class
	/// </summary>
	[SimplInherit]
	public class GooglePatent : Patent
	{
		[SimplScalar]
		private MetadataParsedURL picLink;

		[SimplCollection("search_result")]
		[MmName("referenced_bys")]
		private List<SearchResult> referencedBys;

		[SimplCollection("search_result")]
		[MmName("citations")]
		private List<SearchResult> citations;

		[SimplCollection("search_result")]
		[MmName("pic_links")]
		private List<SearchResult> picLinks;

		public GooglePatent()
		{ }

		public GooglePatent(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataParsedURL PicLink
		{
			get{return picLink;}
			set{picLink = value;}
		}

		public List<SearchResult> ReferencedBys
		{
			get{return referencedBys;}
			set{referencedBys = value;}
		}

		public List<SearchResult> Citations
		{
			get{return citations;}
			set{citations = value;}
		}

		public List<SearchResult> PicLinks
		{
			get{return picLinks;}
			set{picLinks = value;}
		}
	}
}
