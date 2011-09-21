package com.intellij.generatetestcases.util;

import com.intellij.generatetestcases.reference.ReferenceProvider;
import com.intellij.patterns.ElementPattern;
import com.intellij.patterns.ElementPatternCondition;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceContributor;
import com.intellij.psi.PsiReferenceRegistrar;
import com.intellij.psi.javadoc.PsiDocTag;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.Nullable;

/**
 * Created by IntelliJ IDEA.
 * User: jhe
 * Date: 17/09/11
 * Time: 22:15
 * To change this template use File | Settings | File Templates.
 */
public class ReferenceContributor extends PsiReferenceContributor{


    @Override
    public void registerReferenceProviders(PsiReferenceRegistrar registrar) {

        // TODO we add a provider tthat matches PsiDocTags
        registrar.registerReferenceProvider(PlatformPatterns.psiElement(PsiDocTag.class),new ReferenceProvider());
    }
}