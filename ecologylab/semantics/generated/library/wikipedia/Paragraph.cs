//
// Paragraph.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.generated.library.wikipedia;
using ecologylab.semantics.metadata;
using ecologylab.semantics.metadata.builtins;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.metametadata;

namespace ecologylab.semantics.generated.library.wikipedia 
{
	[SimplInherit]
	public class Paragraph : Metadata
	{
		/// <summary>
		/// Anchors (links) in the paragraph, typically links to another Wikipedia article.
		/// </summary>
		[SimplCollection("wiki_anchor")]
		[MmName("anchors")]
		private List<WikiAnchor> anchors;

		[SimplScalar]
		private MetadataString paragraphText;

		public Paragraph()
		{ }

		public Paragraph(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<WikiAnchor> Anchors
		{
			get{return anchors;}
			set
			{
				if (this.anchors != value)
				{
					this.anchors = value;
					this.RaisePropertyChanged( () => this.Anchors );
				}
			}
		}

		public MetadataString ParagraphText
		{
			get{return paragraphText;}
			set
			{
				if (this.paragraphText != value)
				{
					this.paragraphText = value;
					this.RaisePropertyChanged( () => this.ParagraphText );
				}
			}
		}
	}
}