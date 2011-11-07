//
// IcdlBookPreview.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator on 11/07/11.
// Copyright 2011 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.creativeWork;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.icdl 
{
	/// <summary>
	/// ICDL About This Book Page
	/// </summary>
	[SimplInherit]
	public class IcdlBookPreview : Metadata
	{
		[SimplComposite]
		[MmName("author")]
		private Author author;

		[SimplComposite]
		[MmName("illustrator")]
		private Author illustrator;

		[SimplScalar]
		private MetadataString summary;

		[SimplScalar]
		private MetadataString year;

		[SimplScalar]
		private MetadataString languages;

		[SimplScalar]
		private MetadataString publisher;

		[SimplScalar]
		private MetadataString isbn;

		[SimplScalar]
		private MetadataString awards;

		public IcdlBookPreview()
		{ }

		public IcdlBookPreview(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Author Author
		{
			get{return author;}
			set{author = value;}
		}

		public Author Illustrator
		{
			get{return illustrator;}
			set{illustrator = value;}
		}

		public MetadataString Summary
		{
			get{return summary;}
			set{summary = value;}
		}

		public MetadataString Year
		{
			get{return year;}
			set{year = value;}
		}

		public MetadataString Languages
		{
			get{return languages;}
			set{languages = value;}
		}

		public MetadataString Publisher
		{
			get{return publisher;}
			set{publisher = value;}
		}

		public MetadataString Isbn
		{
			get{return isbn;}
			set{isbn = value;}
		}

		public MetadataString Awards
		{
			get{return awards;}
			set{awards = value;}
		}
	}
}
