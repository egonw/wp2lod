/* CVS $Id: $ */
 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from http://vocabularies.wikipathways.org/gpml.rdf 
 * @author Auto-generated by schemagen on 11 Nov 2013 18:56 
 */
public class Gpml {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://vocabularies.wikipathways.org/gpml#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final Property align = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#align" );
    
    public static final Property anchorPosition = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#anchorPosition" );
    
    public static final Property anchorShape = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#anchorShape" );
    
    public static final Property arrowHead = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#arrowHead" );
    
    public static final Property arrowTowards = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#arrowTowards" );
    
    /** <p>The person who created or edited the pathway in question.</p> */
    public static final Property author = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#author" );
    
    /** <p>Here comes the description on: biopaxref</p> */
    public static final Property biopaxref = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#biopaxref" );
    
    /** <p>Here comes the description on: centerx</p> */
    public static final Property centerx = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#centerx" );
    
    /** <p>Here comes the description on: centery</p> */
    public static final Property centery = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#centery" );
    
    public static final Property color = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#color" );
    
    /** <p>Database from which the identifier used to annotate the biological entity 
     *  is obtained, e.g HMDB, Ensembl etc.</p>
     */
    public static final Property data_source = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#data-source" );
    
    public static final Property database = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#database" );
    
    /** <p>Here comes the description on: email</p> */
    public static final Property email = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#email" );
    
    public static final Property fillcolor = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fillcolor" );
    
    public static final Property fontattributes = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontattributes" );
    
    public static final Property fontdecoration = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontdecoration" );
    
    public static final Property fontname = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontname" );
    
    public static final Property fontsize = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontsize" );
    
    public static final Property fontstrikethru = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontstrikethru" );
    
    public static final Property fontstyle = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontstyle" );
    
    /** <p>Thickness of the font used, e.g a bold font would have more weight.</p> */
    public static final Property fontweight = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#fontweight" );
    
    public static final Property genmappNotes = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#genmappNotes" );
    
    public static final Property genmappremarks = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#genmappremarks" );
    
    public static final Property graphics = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#graphics" );
    
    /** <p>Here comes the description on: graphid</p> */
    public static final Property graphid = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#graphid" );
    
    /** <p>Here comes the description on: graphref</p> */
    public static final Property graphref = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#graphref" );
    
    /** <p>Here comes the description on: groupid</p> */
    public static final Property groupid = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#groupid" );
    
    /** <p>Here comes the description on: groupref</p> */
    public static final Property groupref = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#groupref" );
    
    public static final Property hasAnchor = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#hasAnchor" );
    
    public static final Property height = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#height" );
    
    public static final Property homologyConvert = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#homologyConvert" );
    
    /** <p>Here comes the description on: href</p> */
    public static final Property href = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#href" );
    
    public static final Property id = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#id" );
    
    /** <p>Here comes the description on: last-modified</p> */
    public static final Property last_modified = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#last-modified" );
    
    /** <p>Here comes the description on: license</p> */
    public static final Property license = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#license" );
    
    public static final Property linestyle = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#linestyle" );
    
    public static final Property linethickness = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#linethickness" );
    
    /** <p>Here comes the description on: maintainer</p> */
    public static final Property maintainer = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#maintainer" );
    
    /** <p>Here comes the description on: name</p> */
    public static final Property name = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#name" );
    
    /** <p>The organism for which the biological process represented in the pathway is 
     *  either identified or predicted.</p>
     */
    public static final Property organism = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#organism" );
    
    public static final Property pointOrder = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#pointOrder" );
    
    public static final Property rectattributes = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#rectattributes" );
    
    public static final Property relX = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#relX" );
    
    public static final Property relY = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#relY" );
    
    public static final Property shapestyleattributes = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#shapestyleattributes" );
    
    /** <p>Here comes the description on: statetype</p> */
    public static final Property statetype = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#statetype" );
    
    /** <p>Here comes the description on: style</p> */
    public static final Property style = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#style" );
    
    /** <p>Here comes the description on: textlabel</p> */
    public static final Property textlabel = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#textlabel" );
    
    public static final Property unifiedIdentifier = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#unifiedIdentifier" );
    
    public static final Property valign = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#valign" );
    
    /** <p>Here comes the description on: version</p> */
    public static final Property version = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#version" );
    
    public static final Property width = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#width" );
    
    public static final Property wikipathwaysDescription = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#wikipathwaysDescription" );
    
    public static final Property x = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#x" );
    
    public static final Property y = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#y" );
    
    public static final Property zorder = m_model.createProperty( "http://vocabularies.wikipathways.org/gpml#zorder" );
    
    public static final Resource Anchor = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Anchor" );
    
    /** <p>An arrow head of type arrow indicates a directed interaction with no inhibiting 
     *  function.</p>
     */
    public static final Resource ArrowHeadArrow = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#ArrowHeadArrow" );
    
    /** <p>An arrow head of type line indicates an interaction input or of undirected 
     *  interaction.</p>
     */
    public static final Resource ArrowHeadLine = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#ArrowHeadLine" );
    
    /** <p>An arrow head of type TBar indicates a directed interaction with inhibiting 
     *  function.</p>
     */
    public static final Resource ArrowHeadTBar = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#ArrowHeadTBar" );
    
    /** <p>Here comes the description on: Biopax</p> */
    public static final Resource Biopax = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Biopax" );
    
    /** <p>&lt;strong&gt;Datanode&lt;/strong&gt; is a biological entity that forms a 
     *  node in a pathway and has some biological meaning associated with it; e.g 
     *  gene, metabolite, protein etc. Types of DataNodes currently recognized by 
     *  PathVisio are: &lt;ul&gt; &lt;li&gt;Genes,&lt;/li&gt; &lt;li&gt;Proteins,&lt;/li&gt; 
     *  &lt;li&gt;Metaboltes, &lt;/li&gt;&lt;li&gt;RNAs, &lt;/li&gt;&lt;li&gt;Pathways, 
     *  &lt;/li&gt; and &lt;li&gt;Unknown.&lt;/li&gt;&lt;/ul&gt;</p>
     */
    public static final Resource DataNode = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#DataNode" );
    
    /** <p>A collection of structurally or functionally similar datanodes.</p> */
    public static final Resource Group = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Group" );
    
    /** <p>Here comes the description on: InfoBox</p> */
    public static final Resource InfoBox = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#InfoBox" );
    
    /** <p>An interaction defines the relationship between the two datanodes it connects.</p> */
    public static final Resource Interaction = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Interaction" );

    /** <p>A label is a text box which can be used to describe the elements of a pathway. 
     *  It is mostly used as a name tag, to describe datanodes, interactions or cellular 
     *  compartments in a pathway.</p>
     */
    public static final Resource Label = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Label" );
    
    /** <p>An explanatory list of the colours used for visualizing data on the pathway.</p> */
    public static final Resource Legend = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Legend" );
    
    /** <p>An interaction where the controller entity is necessary for the controlled 
     *  interaction to proceed.</p>
     */
    public static final Resource MimNecessaryStimulation = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#MimNecessaryStimulation" );
    
    /** <p>A graph diagram representing a biological process. Nodes of which represent 
     *  genes, proteins, metabolites etc and the edges connecting two nodes represent 
     *  the relationship between them, i.e how the two nodes interact.</p>
     */
    public static final Resource Pathway = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Pathway" );
    
    public static final Resource Point = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Point" );
    
    public static final Resource PublicationXref = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#PublicationXref" );
    
    /** <p>Shape represents some form of geometric shape, e.g rectangle, rounded rectangle, 
     *  oval etc.</p>
     */
    public static final Resource Shape = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Shape" );
    
    /** <p>The particular condition that biological entity is in at a specific time, 
     *  e.g a protein may be phosphorylated or not, so phosphorylation is a state 
     *  that a protein may have.</p>
     */
    public static final Resource State = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#State" );
    
    /** <p>Constitutes of text representing an identifier and the system code of the 
     *  database from which the identifier was obtained, e.g: If a metabolite in the 
     *  pathway is annotated with the identifier HMDB00122 from the database HMDB, 
     *  it's &lt;strong&gt;xref&lt;/strong&gt; would be Ch:HMDB00122. Ch is the system 
     *  code using which PathVisio identifies the database HMDB.</p>
     */
    public static final Resource Xref = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Xref" );
    
    public static final Resource requiresCurationAttention = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#requiresCurationAttention" );
    
    public static final Resource University = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#Maastricht%20University" );
    
    public static final Resource andra = m_model.createResource( "http://vocabularies.wikipathways.org/gpml#andra" );
    
}
