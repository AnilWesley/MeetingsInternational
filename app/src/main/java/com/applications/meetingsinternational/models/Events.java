package com.applications.meetingsinternational.models;

import java.io.Serializable;
import java.util.List;

public class Events implements Serializable {


    /**
     * status : true
     * total_pages : 2
     * conferences : [{"id":"364","conf_type":"webinar","short_name":"Webinar on Stress Management","city":"","country":"","subject":"Psychiatry","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/stress-management","icon_url":""},{"id":"365","conf_type":"webinar","short_name":"Webinar on Suicidal Risk","city":"","country":"","subject":"Psychiatry","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/suicidal-risk","icon_url":""},{"id":"366","conf_type":"webinar","short_name":"Webinar on Anxiety","city":"","country":"","subject":"Psychiatry","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/anxiety","icon_url":""},{"id":"367","conf_type":"webinar","short_name":"Antibiotics Webinar 2020","city":"","country":"","subject":"Webinars","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/antibiotics","icon_url":""},{"id":"368","conf_type":"webinar","short_name":"Psychology Webinar 2020","city":"","country":"","subject":"Webinars","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/psychology","icon_url":""},{"id":"369","conf_type":"webinar","short_name":"Therapeutics Webinar 2020","city":"","country":"","subject":"Webinars","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/therapeutics","icon_url":""},{"id":"370","conf_type":"conference","short_name":"Pathology Webinar 2020","city":"","country":"","subject":"Webinars","start_date":"","end_date":"","url":"https://www.longdom.com/pathology","icon_url":""},{"id":"375","conf_type":"webinar","short_name":"Pain Management Webinar 2020","city":"","country":"","subject":"Webinars","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/painmanagement","icon_url":""},{"id":"379","conf_type":"webinar","short_name":"Bio-Engineering 2020","city":"","country":"","subject":"Biotechnology","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/bioengineering","icon_url":""},{"id":"380","conf_type":"webinar","short_name":"Sequencing 2020","city":"","country":"","subject":"Biotechnology","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/sequencing","icon_url":""},{"id":"381","conf_type":"webinar","short_name":"Robotics 2020","city":"","country":"","subject":"Engineering","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/robotics","icon_url":""},{"id":"383","conf_type":"webinar","short_name":"Gene Therapy 2020 ","city":"","country":"","subject":"Biotechnology","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/genetherapy","icon_url":""},{"id":"385","conf_type":"webinar","short_name":"Structural Chemistry 2020","city":"","country":"","subject":"Chemistry","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/structuralchemistry","icon_url":""},{"id":"387","conf_type":"webinar","short_name":"Dental 2020","city":"","country":"","subject":"Dental","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/dental","icon_url":""},{"id":"388","conf_type":"webinar","short_name":"Food Security 2020","city":"","country":"","subject":"Food Technology","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/foodsecurity","icon_url":""},{"id":"391","conf_type":"webinar","short_name":"Gynecology 2020","city":"","country":"","subject":"Health Care","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/gynecology","icon_url":""},{"id":"392","conf_type":"webinar","short_name":"surgicalpathology","city":"","country":"","subject":"Webinars","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/surgical-pathology-webinar","icon_url":""},{"id":"393","conf_type":"webinar","short_name":"Webinar on Hypertension and Healthcare","city":"","country":"","subject":"Webinars","start_date":"","end_date":"","url":"https://www.longdom.com/webinars/hypertension-healthcare","icon_url":""},{"id":"398","conf_type":"conference","short_name":"Dentistry 2021","city":"","country":"","subject":"Dental","start_date":"","end_date":"","url":"https://www.longdom.com/dentistry","icon_url":""},{"id":"290","conf_type":"webinar","short_name":"Virology Webinar 2020","city":"Paris","country":"France","subject":"Webinars","start_date":"05-07-2020","end_date":"05-07-2020","url":"https://www.longdom.com/webinars/virology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/virolgy-255x190-290.jpg"},{"id":"82","conf_type":"conference","short_name":"1st Dementia Conference","city":"Berlin","country":"Germany","subject":"Medical & Health","start_date":"08-17-2020","end_date":"08-17-2020","url":"https://www.longdom.com/cme-dementia","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/dementia-82.jpg"},{"id":"310","conf_type":"webinar","short_name":"Webinar on Public Healthcare","city":"Dubai","country":"UAE","subject":"Medical & Health","start_date":"08-17-2020","end_date":"08-17-2020","url":"https://www.longdom.com/webinars/publichealthcare","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/public-health-255x190-310.jpg"},{"id":"270","conf_type":"webinar","short_name":"Medicine 2020","city":"London","country":"UK","subject":"Webinars","start_date":"08-20-2020","end_date":"08-20-2020","url":"https://www.longdom.com/webinars/hospitalmanagement","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/untitled-design-270.jpg"},{"id":"308","conf_type":"webinar","short_name":"Webinar on Recycling","city":"Dubai","country":"UAE","subject":"Webinars","start_date":"08-21-2020","end_date":"08-21-2020","url":"https://www.longdom.com/webinars/recycling","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/11234268-308.jpg"},{"id":"325","conf_type":"webinar","short_name":"Neuroscience Webinar","city":"Toronto","country":"Canada","subject":"Neurology","start_date":"08-24-2020","end_date":"08-24-2020","url":"https://www.longdom.com/webinars/neuroscience-mental-health","icon_url":""},{"id":"340","conf_type":"webinar","short_name":"Precision Medicine","city":"London","country":"UK","subject":"Medical & Health","start_date":"08-28-2020","end_date":"08-28-2020","url":"https://www.longdom.com/webinars/precisionmedicine","icon_url":""},{"id":"343","conf_type":"webinar","short_name":"Personalized Medicine","city":"London","country":"UK","subject":"Medical & Health","start_date":"08-28-2020","end_date":"08-28-2020","url":"https://www.longdom.com/webinars/personalizedmedicine","icon_url":""},{"id":"344","conf_type":"webinar","short_name":"Healthcare Webinar 2020","city":"London","country":"UK","subject":"Medical & Health","start_date":"08-28-2020","end_date":"08-28-2020","url":"https://www.longdom.com/webinars/healthinformatics","icon_url":""},{"id":"329","conf_type":"webinar","short_name":"Pollution Control Webinar 2020","city":"London","country":"UK","subject":"Environmental Sciences","start_date":"08-29-2020","end_date":"08-29-2020","url":"https://www.longdom.com/webinars/pollutioncontrol","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/pollutionwebinar-329.jpg"},{"id":"337","conf_type":"webinar","short_name":"Sports Medicine and Physiotherapy","city":"London","country":"UK","subject":"Medical & Health","start_date":"08-29-2020","end_date":"08-29-2020","url":"https://www.longdom.com/webinars/physiotherapy","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/sports-medicine-img-337.jpg"},{"id":"30","conf_type":"webinar","short_name":"Nanotechnology webinar","city":"Paris","country":"France","subject":"Webinars","start_date":"08-31-2020","end_date":"08-31-2020","url":"https://www.longdom.com/webinars/nanotechnology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/nano-30.jpg"},{"id":"260","conf_type":"webinar","short_name":"Webinar on Health care & Health Economics and Policy","city":"London","country":"UK","subject":"Webinars","start_date":"08-31-2020","end_date":"08-31-2020","url":"https://www.longdom.com/webinars/healtheconomics","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/patient-260.jpg"},{"id":"341","conf_type":"webinar","short_name":"COVID Vaccines 2020","city":"Rome","country":"Italy","subject":"Webinars","start_date":"08-31-2020","end_date":"08-31-2020","url":"https://www.longdom.com/webinars/covid19vaccination","icon_url":""},{"id":"342","conf_type":"webinar","short_name":"Webinar on Microbes and Pharmaceutical Sciences","city":"Rome","country":"Italy","subject":"Webinars","start_date":"08-31-2020","end_date":"08-31-2020","url":"https://www.longdom.com/webinars/microbes","icon_url":""},{"id":"321","conf_type":"webinar","short_name":"Cosmetology Webinar 2020","city":"London","country":"UK","subject":"Webinars","start_date":"09-04-2020","end_date":"09-04-2020","url":"https://www.longdom.com/webinars/trichology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/67-cosmetologist-scaled-321.jpg"},{"id":"339","conf_type":"webinar","short_name":"Veterinary medicine 2020","city":"London","country":"UK","subject":"Veterinary","start_date":"09-05-2020","end_date":"09-05-2020","url":"https://www.longdom.com/webinars/veterinarymedicine","icon_url":""},{"id":"250","conf_type":"conference","short_name":"3rd Euro Renewable Energy Conference","city":"London","country":"UK","subject":"Energy","start_date":"09-09-2020","end_date":"09-09-2020","url":"https://www.longdom.com/euro-renewableenergy","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/renewable-pic-header-250.png"},{"id":"273","conf_type":"webinar","short_name":"2nd Respiratory Webinar","city":"London","country":"UK","subject":"Webinars","start_date":"09-10-2020","end_date":"09-10-2020","url":"https://www.longdom.com/webinars/pulmonology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/rc4-273.jpg"},{"id":"363","conf_type":"webinar","short_name":"Webinar on Addiction","city":"Paris","country":"France","subject":"Psychiatry","start_date":"09-10-2020","end_date":"09-10-2020","url":"https://www.longdom.com/webinars/addiction","icon_url":""},{"id":"334","conf_type":"webinar","short_name":"Nanotechnology and Nanomedicine","city":"London","country":"UK","subject":"Webinars","start_date":"09-14-2020","end_date":"09-14-2020","url":"https://www.longdom.com/webinars/nanomedicine","icon_url":""},{"id":"389","conf_type":"webinar","short_name":"Applied Microbes 2020","city":"London","country":"UK","subject":"Microbiology","start_date":"09-16-2020","end_date":"09-16-2020","url":"https://www.longdom.com/webinars/appliedmicrobes","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/unnamed-389.jpg"},{"id":"384","conf_type":"webinar","short_name":"Food Safety 2020","city":"London","country":"UK","subject":"Food Technology","start_date":"09-17-2020","end_date":"09-17-2020","url":"https://www.longdom.com/webinars/foodsafety","icon_url":""},{"id":"224","conf_type":"conference","short_name":"1st Osteoporosis Conference","city":"London","country":"UK","subject":"Medical and Clinical Sciences","start_date":"09-18-2020","end_date":"09-18-2020","url":"https://www.longdom.com/osteoporosis","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/osteporosis-2020-images-224.jpg"},{"id":"282","conf_type":"webinar","short_name":"Nutrition Webinar 2020","city":"London","country":"UK","subject":"Health Care","start_date":"09-18-2020","end_date":"09-18-2020","url":"https://www.longdom.com/webinars/publichealth","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/n-282.jpg"},{"id":"304","conf_type":"webinar","short_name":"Dermatology 2020","city":"London","country":"UK","subject":"Health Care","start_date":"09-18-2020","end_date":"09-18-2020","url":"https://www.longdom.com/webinars/dermatology","icon_url":""},{"id":"324","conf_type":"webinar","short_name":"3rd Webinar on Alternative Medicine and Herbal Medicine","city":"London","country":"UK","subject":"Medical and Clinical Sciences","start_date":"09-18-2020","end_date":"09-18-2020","url":"https://www.longdom.com/webinars/alternativemedicine","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/alternative-medicine-everglades-u-324.jpg"},{"id":"372","conf_type":"webinar","short_name":"Health Sceince Webinar 2020","city":"London","country":"UK","subject":"Webinars","start_date":"09-18-2020","end_date":"09-18-2020","url":"https://www.longdom.com/webinars/healthscience","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/n-372.jpg"},{"id":"390","conf_type":"webinar","short_name":"Infectious Diseases 2020","city":"London","country":"UK","subject":"Microbiology","start_date":"09-18-2020","end_date":"09-18-2020","url":"https://www.longdom.com/webinars/infectiousdiseases","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/images-390.jpg"},{"id":"345","conf_type":"webinar","short_name":"Hypertension Meet 2020","city":"Berlin","country":"Germany","subject":"Webinars","start_date":"09-19-2020","end_date":"09-19-2020","url":"https://www.longdom.com/webinars/hypertension","icon_url":""},{"id":"223","conf_type":"conference","short_name":"1st Public Health conference","city":"Tokyo","country":"Japan","subject":"Medical & Health","start_date":"09-21-2020","end_date":"09-22-2020","url":"https://www.longdom.com/publichealth","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/public-health-223.png"},{"id":"225","conf_type":"conference","short_name":"1st Traditional Medicine Conference","city":"Tokyo","country":"Japan","subject":"Medical & Health","start_date":"09-21-2020","end_date":"09-22-2020","url":"https://www.longdom.com/traditionalmedicine","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/traditional-medicine-225.jpg"},{"id":"251","conf_type":"conference","short_name":"2nd Euro Climate Change Conference","city":"Paris","country":"France","subject":"Environmental Sciences","start_date":"09-21-2020","end_date":"09-21-2020","url":"https://www.longdom.com/climatechange","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/climate-change-251.jpg"},{"id":"261","conf_type":"webinar","short_name":"Mental Health 2020","city":"London","country":"UK","subject":"Webinars","start_date":"09-21-2020","end_date":"09-21-2020","url":"https://www.longdom.com/webinars/mentalhealth","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/untitled-design-1-261.png"},{"id":"349","conf_type":"webinar","short_name":"Surgery Webinar 2020","city":"London","country":"UK","subject":"Medical & Health","start_date":"09-22-2020","end_date":"09-22-2020","url":"https://www.longdom.com/webinars/plastic-surgery","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/surgery-icon-349.jpg"},{"id":"41","conf_type":"conference","short_name":"1st Spectrometry Conference","city":"London","country":"UK","subject":"Physics","start_date":"09-24-2020","end_date":"09-24-2020","url":"https://www.longdom.com/spectrometry","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/image-41.jpg"},{"id":"265","conf_type":"webinar","short_name":"Hospice Webinar 2020","city":"London","country":"UK","subject":"Webinars","start_date":"09-24-2020","end_date":"09-24-2020","url":"https://www.longdom.com/webinars/palliativecare","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/hospice-265.jpg"},{"id":"338","conf_type":"webinar","short_name":"Obesity 2020","city":"London","country":"UK","subject":"Medical & Health","start_date":"09-24-2020","end_date":"09-24-2020","url":"https://www.longdom.com/webinars/diabetes","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/111-338.jpg"},{"id":"328","conf_type":"webinar","short_name":"Epidemiology Webinar 2020","city":"London","country":"UK","subject":"Webinars","start_date":"10-05-2020","end_date":"10-05-2020","url":"https://www.longdom.com/webinars/epidemiology","icon_url":""},{"id":"386","conf_type":"webinar","short_name":"Pharmaceutical Sciences 2020","city":"London","country":"UK","subject":"Pharmacy","start_date":"10-06-2020","end_date":"10-06-2020","url":"https://www.longdom.com/webinars/pharmaceuticalsciences","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/2-386.jpg"},{"id":"397","conf_type":"webinar","short_name":"Sports Nutrition 2020","city":"London","country":"UK","subject":"Health Care","start_date":"10-08-2020","end_date":"10-08-2020","url":"https://www.longdom.com/webinars/sportsnutrition","icon_url":""},{"id":"56","conf_type":"conference","short_name":"1st Personalized Medicine Conference","city":"Vancouver","country":"Canada","subject":"Medical & Health","start_date":"10-14-2020","end_date":"10-15-2020","url":"https://www.longdom.com/personalized-medicine","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/biomaterials-56.jpg"},{"id":"200","conf_type":"conference","short_name":"2nd  Advanced Dentistry conference","city":"Vancouver","country":"Canada","subject":"Medical & Health","start_date":"10-19-2020","end_date":"10-20-2020","url":"https://www.longdom.com/advanceddentistry","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/adv-dent-200.jpg"},{"id":"371","conf_type":"webinar","short_name":"Molecular Science Webinar 2020","city":"London","country":"UK","subject":"Cell Biology","start_date":"10-21-2020","end_date":"10-21-2020","url":"https://www.longdom.com/webinars/molecularscience","icon_url":""},{"id":"141","conf_type":"conference","short_name":"1st Robotics conference","city":"Rome","country":"Italy","subject":"Engineering","start_date":"10-22-2020","end_date":"10-23-2020","url":"https://www.longdom.com/robotics","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/artificial-intelligence-automation-and-robotics-141gif"},{"id":"186","conf_type":"webinar","short_name":"1st AI Webinar","city":"Rome","country":"Italy","subject":"Engineering","start_date":"10-22-2020","end_date":"10-22-2020","url":"https://www.longdom.com/webinars/artificialintelligence","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/european-business-ai-and-robotics-186.jpg"},{"id":"233","conf_type":"conference","short_name":"1st World Cardiology Conference","city":"Paris","country":"France","subject":"Medical & Health","start_date":"10-22-2020","end_date":"10-23-2020","url":"https://www.longdom.com/cardiology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/cardiology-2334da9ab808b1a25fa61d685260476610d-233.jpg"},{"id":"377","conf_type":"webinar","short_name":"Business Management 2020","city":"Dubai","country":"UAE","subject":"Business Management","start_date":"10-26-2020","end_date":"10-26-2020","url":"https://www.longdom.com/webinars/business-management","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/business-377.jpg"},{"id":"382","conf_type":"webinar","short_name":"Plant Biotechnology 2020","city":"London","country":"UK","subject":"Biotechnology","start_date":"10-26-2020","end_date":"10-26-2020","url":"https://www.longdom.com/webinars/plantbiotechnology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/download-382.jpg"},{"id":"378","conf_type":"webinar","short_name":"Molecular Biology 2020","city":"London","country":"UK","subject":"Biotechnology","start_date":"10-27-2020","end_date":"10-27-2020","url":"https://www.longdom.com/webinars/molecularbiology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/7-378.jpg"},{"id":"395","conf_type":"webinar","short_name":"Nano Tech 2020","city":"London","country":"UK","subject":"Webinars","start_date":"10-27-2020","end_date":"10-27-2020","url":"https://www.longdom.com/webinars/materialscience","icon_url":""},{"id":"376","conf_type":"webinar","short_name":"Pathology Congress 2020","city":"Rome","country":"Italy","subject":"Health Care","start_date":"10-28-2020","end_date":"10-28-2020","url":"https://www.longdom.com/webinars/pathology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/pathology-22-376.jpg"},{"id":"373","conf_type":"webinar","short_name":"Pharmaceutics 2020","city":"London","country":"UK","subject":"Webinars","start_date":"10-29-2020","end_date":"10-29-2020","url":"https://www.longdom.com/webinars/pharmaceutics","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/untitled-373.png"},{"id":"374","conf_type":"webinar","short_name":"Plantgenomics Webinar 2020","city":"London","country":"UK","subject":"Webinars","start_date":"10-29-2020","end_date":"10-29-2020","url":"https://www.longdom.com/webinars/plantgenomics","icon_url":""},{"id":"394","conf_type":"webinar","short_name":"Stroke Medicine 2020","city":"Osaka","country":"Japan","subject":"Webinars","start_date":"10-29-2020","end_date":"10-29-2020","url":"https://www.longdom.com/webinars/strokemedicine","icon_url":""},{"id":"47","conf_type":"conference","short_name":"1st Surgery Conference","city":"Vancouver","country":"Canada","subject":"Medical & Health","start_date":"10-30-2020","end_date":"10-30-2020","url":"https://www.longdom.com/surgery-anesthesia","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/istock79888929large-47.jpg"},{"id":"235","conf_type":"conference","short_name":"1st  Euro Nutrition 2020","city":"Paris","country":"France","subject":"Food Science","start_date":"11-09-2020","end_date":"11-09-2020","url":"https://www.longdom.com/euronutrition","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/foodandnutrition-347x346-235.jpg"},{"id":"240","conf_type":"conference","short_name":"1st Pharmaceutics conference","city":"Paris","country":"France","subject":"Pharma","start_date":"11-09-2020","end_date":"11-10-2020","url":"https://www.longdom.com/pharmaceutics","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/download-1-240.jpg"},{"id":"243","conf_type":"conference","short_name":"1st Public Health Conference","city":"Paris","country":"France","subject":"Medical & Health","start_date":"11-09-2020","end_date":"11-10-2020","url":"https://www.longdom.com/europublichealth","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/opti-243.jpg"},{"id":"236","conf_type":"conference","short_name":"1st Dental 2020 Conference","city":"London","country":"UK","subject":"Medical & Health","start_date":"11-13-2020","end_date":"11-14-2020","url":"https://www.longdom.com/eurodental","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/dental-conference-icon-236.png"},{"id":"244","conf_type":"conference","short_name":" 1st Psychiatry conference","city":"Paris","country":"France","subject":"Medical & Health","start_date":"11-13-2020","end_date":"11-13-2020","url":"https://www.longdom.com/psychiatry","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/brain-24429c5514c9ee8982d6288b7670f6b3f5b-244.jpg"},{"id":"230","conf_type":"conference","short_name":"1st Respiratory Conference","city":"Paris","country":"France","subject":"Medical & Health","start_date":"11-16-2020","end_date":"11-17-2020","url":"https://www.longdom.com/respiratoryconference","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/2-230.jpg"},{"id":"234","conf_type":"conference","short_name":"1st Nursing Research Conference","city":"New York","country":"USA","subject":"Medical and Clinical Sciences","start_date":"11-23-2020","end_date":"11-24-2020","url":"https://www.longdom.com/nursingresearch","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/nursing-research-234.jpg"},{"id":"238","conf_type":"conference","short_name":"1st Future Cancer Treatment Conference","city":"New York","country":"USA","subject":"Medical and Clinical Sciences","start_date":"11-23-2020","end_date":"11-24-2020","url":"https://www.longdom.com/cancertreatment","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/cancer-treatment-238.jpg"},{"id":"241","conf_type":"conference","short_name":"1st Gastro Conference","city":"Rome","country":"Italy","subject":"Medical & Health","start_date":"11-23-2020","end_date":"11-24-2020","url":"https://www.longdom.com/gastro","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/gastro-image-copy-241.png"},{"id":"242","conf_type":"conference","short_name":"1st Euro Pediatrics Conference","city":"Madrid","country":"Spain","subject":"Medical and Clinical Sciences","start_date":"11-23-2020","end_date":"11-23-2020","url":"https://www.longdom.com/europediatrics","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/pediatrics-icon-242-242.jpg"},{"id":"245","conf_type":"conference","short_name":"1st Oncology Research Conference","city":"New York","country":"USA","subject":"Medical & Health","start_date":"11-23-2020","end_date":"11-24-2020","url":"https://www.longdom.com/neurooncology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/ssc2014wallpaper1280x10240009oct-245.jpg"},{"id":"248","conf_type":"conference","short_name":"Polymer Chemistry Conference","city":"Madrid","country":"Spain","subject":"Chemistry","start_date":"11-23-2020","end_date":"11-24-2020","url":"https://www.longdom.com/polymerchemistry-2020","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/polymer-248.jpg"},{"id":"207","conf_type":"conference","short_name":"2nd Euro Heart Conference","city":"New York","country":"USA","subject":"Medical & Health","start_date":"11-25-2020","end_date":"11-26-2020","url":"https://www.longdom.com/euroheart","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/heart-congress-207.jpg"},{"id":"220","conf_type":"conference","short_name":" Plant Pathology 2020","city":"New York","country":"USA","subject":"Agricultural Sciences","start_date":"11-25-2020","end_date":"11-26-2020","url":"https://www.longdom.com/plantpathology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/11161862-hand-holding-plant-220.jpg"},{"id":"221","conf_type":"conference","short_name":"1st Fungal Infection Conference","city":"New York","country":"USA","subject":"Microbiology","start_date":"11-25-2020","end_date":"11-26-2020","url":"https://www.longdom.com/fungalinfections","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/fungal-infections-221de75f6f6464c336efb66380f6292170f-221.jpg"},{"id":"222","conf_type":"conference","short_name":"1<sup>st<\/sup> Advanced Drug Discovery Conference","city":"New York","country":"USA","subject":"Pharma","start_date":"11-25-2020","end_date":"11-26-2020","url":"https://www.longdom.com/drugdiscovery","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/drug-discovery-222.jpg"},{"id":"201","conf_type":"conference","short_name":"2nd Dental MAT Conference ","city":"Toronto","country":"Canada","subject":"Medical & Health","start_date":"02-15-2021","end_date":"02-16-2021","url":"https://www.longdom.com/dentalmaterials","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/shutterstock134949509768x576-1255x190-201.jpg"},{"id":"60","conf_type":"conference","short_name":"1st Parasitology Conference","city":"Osaka","country":"Japan","subject":"Medical and Clinical Sciences","start_date":"03-17-2021","end_date":"03-18-2021","url":"https://www.longdom.com/parasitology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/untitled-design-60.jpg"},{"id":"313","conf_type":"conference","short_name":"2nd Infectious Diseases Conference","city":"Paris","country":"France","subject":"Medical & Health","start_date":"03-22-2021","end_date":"03-23-2021","url":"https://www.longdom.com/infectious","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/icon-313.jpg"},{"id":"319","conf_type":"conference","short_name":"2nd Nursing Conference ","city":"Dubai","country":"UAE","subject":"Medical & Health","start_date":"03-22-2021","end_date":"03-23-2021","url":"https://www.longdom.com/cme-nursingeducation","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/c2-319.jpg"},{"id":"346","conf_type":"conference","short_name":"2nd Polymer Chemistry Conference","city":"Dubai","country":"UAE","subject":"Chemistry","start_date":"03-22-2021","end_date":"03-23-2021","url":"https://www.longdom.com/polymerchemistry","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/molecules-644x350-346.png"},{"id":"348","conf_type":"conference","short_name":"1st Hospice Conference","city":"Dubai","country":"UAE","subject":"Medical & Health","start_date":"03-22-2021","end_date":"03-23-2021","url":"https://www.longdom.com/hospiceconference","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/hospice-care-versus-palliative-care-348.jpg"},{"id":"314","conf_type":"conference","short_name":"2nd Euro Dental Conference","city":"Paris","country":"France","subject":"Medical & Health","start_date":"03-24-2021","end_date":"03-25-2021","url":"https://www.longdom.com/dental","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/97d097a091811b0f8c4246a417e4f7569cf46d255x190-314.jpg"},{"id":"359","conf_type":"conference","short_name":"Hypertension Conclave 2021","city":"Tokyo","country":"Japan","subject":"Medical & Health","start_date":"04-19-2021","end_date":"04-20-2021","url":"https://www.longdom.com/cme-hypertension","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/rszhypertension-359.jpg"},{"id":"226","conf_type":"conference","short_name":"2nd Cardiovascular Medicine Conference","city":"Berlin","country":"Germany","subject":"Medical & Health","start_date":"04-21-2021","end_date":"04-22-2021","url":"https://www.longdom.com/cardiovasculardisease","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/493ssthinkstockrfheartanatomyillustration-226.jpg"},{"id":"354","conf_type":"conference","short_name":"2nd World No Diabetes Conference","city":"Berlin","country":"Germany","subject":"Medical & Health","start_date":"04-21-2021","end_date":"04-22-2021","url":"https://www.longdom.com/cme-diabetes","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/adobestock276205639-354.png"},{"id":"396","conf_type":"conference","short_name":"Mental Health 2021","city":"London","country":"UK","subject":"Medical and Clinical Sciences","start_date":"04-26-2021","end_date":"04-27-2021","url":"https://www.longdom.com/mentalhealth","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/tenor1-396.jpg"},{"id":"317","conf_type":"conference","short_name":"2nd Cosmetology Conference","city":"Singapore city","country":"Singapore","subject":"Cosmetology","start_date":"05-17-2021","end_date":"05-18-2021","url":"https://www.longdom.com/cosmetology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/icon-317.png"},{"id":"350","conf_type":"conference","short_name":"1st Alternative Medicine Conference","city":"Osaka","country":"Japan","subject":"Medical & Health","start_date":"05-17-2021","end_date":"05-18-2021","url":"https://www.longdom.com/alternativemedicineconference","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/header-350.jpg"},{"id":"355","conf_type":"conference","short_name":"2nd Veterinary Conference","city":"Osaka","country":"Japan","subject":"Veterinary","start_date":"05-19-2021","end_date":"05-20-2021","url":"https://www.longdom.com/veterinarymedicine","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/vet-icon1-227-355.jpg"},{"id":"347","conf_type":"conference","short_name":"2nd Euro Catalysis Conference","city":"Paris","country":"France","subject":"Chemical Engineering","start_date":"05-21-2021","end_date":"05-22-2021","url":"https://www.longdom.com/eurocat","icon_url":""},{"id":"131","conf_type":"conference","short_name":" Pharmacology Congress2021","city":"Dubai","country":"UAE","subject":"Pharma","start_date":"05-26-2021","end_date":"05-27-2021","url":"https://www.longdom.com/cme-pharmacology","icon_url":""},{"id":"351","conf_type":"conference","short_name":"1st Clinical Psychiatry Conference","city":"Dubai","country":"UAE","subject":"Neurology","start_date":"08-30-2021","end_date":"08-31-2021","url":"https://www.longdom.com/clinicalpsychiatryconference","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/untitled-design-351.png"},{"id":"362","conf_type":"conference","short_name":"Surgery & Cosmetology 2021","city":"Las Vegas","country":"USA","subject":"Medical and Clinical Sciences","start_date":"09-16-2021","end_date":"09-17-2021","url":"https://www.longdom.com/surgeryconference","icon_url":""},{"id":"352","conf_type":"conference","short_name":"2nd Skin Diseases Conference","city":"Paris","country":"France","subject":"Medical & Health","start_date":"10-07-2021","end_date":"10-08-2021","url":"https://www.longdom.com/skindiseaseeconference","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/middle-aged-woman-mole-on-neck-examined-by-doctor-1-352.jpg"},{"id":"357","conf_type":"conference","short_name":"2nd Virology and Vaccines Conference","city":"Paris","country":"France","subject":"Medical & Health","start_date":"10-07-2021","end_date":"10-08-2021","url":"https://www.longdom.com/cme-virology","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/07-blog-vaccines-l-357.jpg"},{"id":"239","conf_type":"conference","short_name":"1st Artificial Intelligence Conference","city":"Paris","country":"France","subject":"Computer Science","start_date":"11-01-2021","end_date":"11-02-2021","url":"https://www.longdom.com/artificialintelligence-robotics","icon_url":"https://s3.amazonaws.com/longdom/conf_icons/4-1-239.jpg"}]
     */

    private boolean status;
    private String total_pages;
    private List<ConferencesBean> conferences;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }

    public List<ConferencesBean> getConferences() {
        return conferences;
    }

    public void setConferences(List<ConferencesBean> conferences) {
        this.conferences = conferences;
    }

    public static class ConferencesBean {
        /**
         * id : 364
         * conf_type : webinar
         * short_name : Webinar on Stress Management
         * city :
         * country :
         * subject : Psychiatry
         * start_date :
         * end_date :
         * url : https://www.longdom.com/webinars/stress-management
         * icon_url :
         */

        private String id;
        private String conf_type;
        private String short_name;
        private String city;
        private String country;
        private String subject;
        private String start_date;
        private String end_date;
        private String url;
        private String icon_url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getConf_type() {
            return conf_type;
        }

        public void setConf_type(String conf_type) {
            this.conf_type = conf_type;
        }

        public String getShort_name() {
            return short_name;
        }

        public void setShort_name(String short_name) {
            this.short_name = short_name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getStart_date() {
            return start_date;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }

        public String getEnd_date() {
            return end_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIcon_url() {
            return icon_url;
        }

        public void setIcon_url(String icon_url) {
            this.icon_url = icon_url;
        }
    }
}
