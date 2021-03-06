// This is a generated file. Not intended for manual editing.
package com.haskforce.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellIdecl extends HaskellCompositeElement {

  @NotNull
  List<HaskellAtype> getAtypeList();

  @NotNull
  List<HaskellCon> getConList();

  @NotNull
  List<HaskellConstr> getConstrList();

  @Nullable
  HaskellContext getContext();

  @NotNull
  List<HaskellCtype> getCtypeList();

  @Nullable
  HaskellFunorpatdecl getFunorpatdecl();

  @Nullable
  HaskellKind getKind();

  @Nullable
  HaskellOqtycon getOqtycon();

  @NotNull
  List<HaskellQtycls> getQtyclsList();

  @NotNull
  List<HaskellTypee> getTypeeList();

  @NotNull
  List<HaskellTyvar> getTyvarList();

  @NotNull
  List<HaskellVars> getVarsList();

  @Nullable
  PsiElement getData();

  @Nullable
  PsiElement getDeriving();

  @Nullable
  PsiElement getNewtype();

  @Nullable
  PsiElement getType();

  @Nullable
  PsiElement getWhitespacelbracetok();

  @Nullable
  PsiElement getWhitespacerbracetok();

  @Nullable
  PsiElement getWhitespacesemitok();

  @Nullable
  PsiElement getDoublearrow();

  @Nullable
  PsiElement getEquals();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

  @Nullable
  PsiElement getSemicolon();

}
