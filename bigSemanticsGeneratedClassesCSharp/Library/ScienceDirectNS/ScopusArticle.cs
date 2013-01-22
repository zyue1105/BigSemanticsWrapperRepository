//
// ScopusArticle.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.ScholarlyArticleNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.ScienceDirectNS 
{
	[SimplInherit]
	public class ScopusArticle : ScholarlyArticle
	{
		[SimplComposite]
		[MmName("source_article")]
		private ScholarlyArticle sourceArticle;

		public ScopusArticle()
		{ }

		public ScopusArticle(MetaMetadataCompositeField mmd) : base(mmd) { }


		public ScholarlyArticle SourceArticle
		{
			get{return sourceArticle;}
			set
			{
				if (this.sourceArticle != value)
				{
					this.sourceArticle = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
