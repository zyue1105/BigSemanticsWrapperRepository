//
// NsfDivision.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.NsfNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.NsfNS 
{
	[SimplInherit]
	public class NsfDivision : CompoundDocument
	{
		[SimplCollection("nsf_program")]
		[MmName("programs")]
		private List<NsfProgram> programs;

		[SimplCollection("nsf_program")]
		[MmName("recently_announced")]
		private List<NsfProgram> recentlyAnnounced;

		[SimplCollection("nsf_program")]
		[MmName("upcoming_due")]
		private List<NsfProgram> upcomingDue;

		[SimplComposite]
		[MmName("staffs")]
		private NsfDivisionStaffList staffs;

		public NsfDivision()
		{ }

		public NsfDivision(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<NsfProgram> Programs
		{
			get{return programs;}
			set
			{
				if (this.programs != value)
				{
					this.programs = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<NsfProgram> RecentlyAnnounced
		{
			get{return recentlyAnnounced;}
			set
			{
				if (this.recentlyAnnounced != value)
				{
					this.recentlyAnnounced = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<NsfProgram> UpcomingDue
		{
			get{return upcomingDue;}
			set
			{
				if (this.upcomingDue != value)
				{
					this.upcomingDue = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public NsfDivisionStaffList Staffs
		{
			get{return staffs;}
			set
			{
				if (this.staffs != value)
				{
					this.staffs = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
