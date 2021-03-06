// This is a generated file. Not intended for manual editing.
package com.haskforce.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.haskforce.psi.HaskellTypes.*;
import com.haskforce.psi.*;

public class HaskellIdeclImpl extends HaskellCompositeElementImpl implements HaskellIdecl {

  public HaskellIdeclImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof HaskellVisitor) ((HaskellVisitor)visitor).visitIdecl(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<HaskellAtype> getAtypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellAtype.class);
  }

  @Override
  @NotNull
  public List<HaskellCon> getConList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellCon.class);
  }

  @Override
  @NotNull
  public List<HaskellConstr> getConstrList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellConstr.class);
  }

  @Override
  @Nullable
  public HaskellContext getContext() {
    return findChildByClass(HaskellContext.class);
  }

  @Override
  @NotNull
  public List<HaskellCtype> getCtypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellCtype.class);
  }

  @Override
  @Nullable
  public HaskellFunorpatdecl getFunorpatdecl() {
    return findChildByClass(HaskellFunorpatdecl.class);
  }

  @Override
  @Nullable
  public HaskellKind getKind() {
    return findChildByClass(HaskellKind.class);
  }

  @Override
  @Nullable
  public HaskellOqtycon getOqtycon() {
    return findChildByClass(HaskellOqtycon.class);
  }

  @Override
  @NotNull
  public List<HaskellQtycls> getQtyclsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellQtycls.class);
  }

  @Override
  @NotNull
  public List<HaskellTypee> getTypeeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTypee.class);
  }

  @Override
  @NotNull
  public List<HaskellTyvar> getTyvarList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellTyvar.class);
  }

  @Override
  @NotNull
  public List<HaskellVars> getVarsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, HaskellVars.class);
  }

  @Override
  @Nullable
  public PsiElement getData() {
    return findChildByType(DATA);
  }

  @Override
  @Nullable
  public PsiElement getDeriving() {
    return findChildByType(DERIVING);
  }

  @Override
  @Nullable
  public PsiElement getNewtype() {
    return findChildByType(NEWTYPE);
  }

  @Override
  @Nullable
  public PsiElement getType() {
    return findChildByType(TYPE);
  }

  @Override
  @Nullable
  public PsiElement getWhitespacelbracetok() {
    return findChildByType(WHITESPACELBRACETOK);
  }

  @Override
  @Nullable
  public PsiElement getWhitespacerbracetok() {
    return findChildByType(WHITESPACERBRACETOK);
  }

  @Override
  @Nullable
  public PsiElement getWhitespacesemitok() {
    return findChildByType(WHITESPACESEMITOK);
  }

  @Override
  @Nullable
  public PsiElement getDoublearrow() {
    return findChildByType(DOUBLEARROW);
  }

  @Override
  @Nullable
  public PsiElement getEquals() {
    return findChildByType(EQUALS);
  }

  @Override
  @Nullable
  public PsiElement getLparen() {
    return findChildByType(LPAREN);
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

  @Override
  @Nullable
  public PsiElement getSemicolon() {
    return findChildByType(SEMICOLON);
  }

}
