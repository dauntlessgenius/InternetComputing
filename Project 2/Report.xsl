<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet 
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
  version="1.0">
  >
  <xsl:output method="html"/> 

  <xsl:template match="/">
    <html><body>
      <xsl:apply-templates/>
    </body></html>
  </xsl:template>
  <xsl:template match="/Report">
    <h1 align="center"> <xsl:value-of select="@title"/> </h1>
    <h3 align="center"> <xsl:value-of select="@author"/> </h3>
    <hr/>
    <xsl:apply-templates select="Chapter"/>
   </xsl:template>
  <xsl:template match="Chapter">
    <xsl:apply-templates select="Chapter-head"/>
    <xsl:apply-templates select="section"/>
  </xsl:template>
  <xsl:template match="Chapter-head">
    <h1 align="left"> <xsl:apply-templates/> </h1>
  </xsl:template>
  <xsl:template match="section">
    <xsl:apply-templates select="section-head"/>
    <xsl:apply-templates select="paragraph"/>
  </xsl:template>
  <xsl:template match="section-head">
    <h2 align="left"> <xsl:apply-templates/> </h2>
  </xsl:template>
  <xsl:template match="paragraph">
    <xsl:apply-templates select="content"/>
  </xsl:template>
  <xsl:template match="content">
    <p> <xsl:apply-templates/> </p>
  </xsl:template>
  <xsl:template match="list">
    <xsl:if test="@type='ordered'">
      <ol>
        <xsl:apply-templates/>
      </ol>
    </xsl:if>
    <xsl:if test="@type='unordered'">
      <ul>
        <xsl:apply-templates/>
      </ul>
    </xsl:if>
  </xsl:template>
  <xsl:template match="item">
    <li> <xsl:apply-templates/> </li>
  </xsl:template>
</xsl:stylesheet>