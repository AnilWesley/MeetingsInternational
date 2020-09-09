package com.applications.meetingsinternational.models;

import java.util.List;

public class Sessions {


    /**
     * status : true
     * tracks : [{"id":"217750","TrackName":"Green Pharmaceutical Technologies","description":"","sub_tracks":[{"TrackName":" PAT applications in the pharmaceutical industry"},{"TrackName":"PAT implementation"},{"TrackName":"Long-term goals of PATs"},{"TrackName":"MVA in PAT (multivariate analysis)"},{"TrackName":""},{"TrackName":""},{"TrackName":""},{"TrackName":"â\u20ac¢\tAdvantages of Nano technological  approaches  to biosensor development"}]},{"id":"217758","TrackName":"Green Chemistry: Challenges and Opportunity","description":"","sub_tracks":[{"TrackName":"super critcal fluid extraction"},{"TrackName":"External field induced membrane separation processes"},{"TrackName":"Extraction â\u20ac\u201c Leaching, Liquid â\u20ac\u201c Liquid extraction and Solid phase extraction"},{"TrackName":""}]},{"id":"218053","TrackName":"Green Polymer and Plastic Chemistry","description":"","sub_tracks":[{"TrackName":"Reversed-phase chromatography"},{"TrackName":"Hydrophobic interaction chromatography"},{"TrackName":"Two-dimensional chromatography"},{"TrackName":"Simulated moving-bed chromatography"},{"TrackName":"Pyrolysis gas chromatography"},{"TrackName":"Fast protein liquid chromatography"},{"TrackName":"Counter current chromatography"},{"TrackName":"Chiral chromatography"}]},{"id":"218054","TrackName":"Green Manufacturing and Engineering","description":"","sub_tracks":[{"TrackName":"Column chromatography"},{"TrackName":"Planar chromatography"},{"TrackName":"Paper chromatography"},{"TrackName":"Thin layer chromatography (TLC)"}]},{"id":"218056","TrackName":"Biofuels and Alternative Energy","description":"","sub_tracks":[{"TrackName":"Market on Chromatography Instrumentation"},{"TrackName":"Gas Chromatography Market"},{"TrackName":"Europe and Rest of the World Share"}]},{"id":"218057","TrackName":"Green Chemistry for Nanoparticle Synthesis","description":"","sub_tracks":[{"TrackName":"Micro particle Sampling"},{"TrackName":"Recent advancements in sample preparation techniques"},{"TrackName":"Role of hyphenation in sample preparation"},{"TrackName":"Role of hyphenation in sample preparation"},{"TrackName":"Recent advances in micro-sample preparation with forensic applications"}]},{"id":"218058","TrackName":"Green Chemistry Strategies for Drug Discovery","description":"","sub_tracks":[{"TrackName":"Solid-phase micro extraction gas chromatographyâ\u20ac\u201cMass spectrometry"},{"TrackName":"Multidimensional chromatography"},{"TrackName":"Optical force chromatography"},{"TrackName":"Fluorescence derivatization in HPLC"}]},{"id":"218059","TrackName":"Bio-Separations: Recent Advances","description":"","sub_tracks":[{"TrackName":"TLC & HPTLC"},{"TrackName":"Solid phase extraction chromatography"},{"TrackName":"Electrophoresis as separation technique in Microbiology and Biotechnology"},{"TrackName":" HPLC & UHPLC as a separation technique"},{"TrackName":"Use of chromatography in toxicology"}]},{"id":"218060","TrackName":"Green Analytical Chemistry","description":"","sub_tracks":[{"TrackName":"Analytical and preparative instrumentation"},{"TrackName":"New trends in the analytical determination of emerging contaminants"}]},{"id":"218061","TrackName":"Green and Sustainability Chemistry","description":"","sub_tracks":[]},{"id":"243081","TrackName":"Green Technologies in Food Production & Food Processing","description":"","sub_tracks":[{"TrackName":"New Approaches in Mass Spectrometry"},{"TrackName":"Recent Advances and Development in Mass Spectrometry"},{"TrackName":"Applications of Mass Spectrometry"},{"TrackName":"Mass Spectrometry Configurations and Separation Techniques"},{"TrackName":"Fundamentals of Mass Spectrometry"}]}]
     */

    private boolean status;
    private List<TracksBean> tracks;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<TracksBean> getTracks() {
        return tracks;
    }

    public void setTracks(List<TracksBean> tracks) {
        this.tracks = tracks;
    }

    public static class TracksBean {
        /**
         * id : 217750
         * TrackName : Green Pharmaceutical Technologies
         * description :
         * sub_tracks : [{"TrackName":" PAT applications in the pharmaceutical industry"},{"TrackName":"PAT implementation"},{"TrackName":"Long-term goals of PATs"},{"TrackName":"MVA in PAT (multivariate analysis)"},{"TrackName":""},{"TrackName":""},{"TrackName":""},{"TrackName":"â\u20ac¢\tAdvantages of Nano technological  approaches  to biosensor development"}]
         */

        private String id;
        private String TrackName;
        private String description;
        private List<SubTracksBean> sub_tracks;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTrackName() {
            return TrackName;
        }

        public void setTrackName(String TrackName) {
            this.TrackName = TrackName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<SubTracksBean> getSub_tracks() {
            return sub_tracks;
        }

        public void setSub_tracks(List<SubTracksBean> sub_tracks) {
            this.sub_tracks = sub_tracks;
        }

        public static class SubTracksBean {
            /**
             * TrackName :  PAT applications in the pharmaceutical industry
             */

            private String TrackName;

            public String getTrackName() {
                return TrackName;
            }

            public void setTrackName(String TrackName) {
                this.TrackName = TrackName;
            }
        }
    }
}
