package com.example

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@EqualsAndHashCode(includes='authority')
@ToString(includes='authority', includeNames=true, includePackage=false)
class Role implements Serializable {

    private static final long serialVersionUID = 1

    String authority

    static constraints = {
        authority blank: false, unique: true
    }

    static mapping = {
        cache true
    }

    String toString() {
        authority
    }
}