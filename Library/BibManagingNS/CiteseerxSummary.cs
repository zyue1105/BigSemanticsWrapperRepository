//
// CiteseerxSummary.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2012 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.BibManagingNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.BibManagingNS 
{
	/// <summary>
	/// Summary page from CiteSeerX.
	/// </summary>
	[SimplInherit]
	public class CiteseerxSummary : CiteseerxRecord
	{
		[SimplComposite]
		[MmName("citation_records")]
		private Document citationRecords;

		[SimplComposite]
		[MmName("active_bibliography_records")]
		private Document activeBibliographyRecords;

		[SimplComposite]
		[MmName("cocitation_records")]
		private Document cocitationRecords;

		public CiteseerxSummary()
		{ }

		public CiteseerxSummary(MetaMetadataCompositeField mmd) : base(mmd) { }


		public Document CitationRecords
		{
			get{return citationRecords;}
			set
			{
				if (this.citationRecords != value)
				{
					this.citationRecords = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Document ActiveBibliographyRecords
		{
			get{return activeBibliographyRecords;}
			set
			{
				if (this.activeBibliographyRecords != value)
				{
					this.activeBibliographyRecords = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Document CocitationRecords
		{
			get{return cocitationRecords;}
			set
			{
				if (this.cocitationRecords != value)
				{
					this.cocitationRecords = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}