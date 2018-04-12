/**
 */
package it.unibz.inf.ontouml.xtext.xcore.impl;

import com.google.common.base.Objects;

import it.unibz.inf.ontouml.xtext.xcore.EndurantType;
import it.unibz.inf.ontouml.xtext.xcore.Generalization;
import it.unibz.inf.ontouml.xtext.xcore.OntoUMLClass;
import it.unibz.inf.ontouml.xtext.xcore.XcorePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.function.Consumer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Onto UML Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl#get_type <em>type</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl#getGeneralizationsToSuperclasses <em>Generalizations To Superclasses</em>}</li>
 *   <li>{@link it.unibz.inf.ontouml.xtext.xcore.impl.OntoUMLClassImpl#getGeneralizationsToSubclasses <em>Generalizations To Subclasses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntoUMLClassImpl extends ModelElementImpl implements OntoUMLClass {
	/**
	 * The default value of the '{@link #get_type() <em>type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_type()
	 * @generated
	 * @ordered
	 */
	protected static final EndurantType _TYPE_EDEFAULT = EndurantType.NONE;

	/**
	 * The cached value of the '{@link #get_type() <em>type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_type()
	 * @generated
	 * @ordered
	 */
	protected EndurantType _type = _TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeneralizationsToSuperclasses() <em>Generalizations To Superclasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationsToSuperclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizationsToSuperclasses;

	/**
	 * The cached value of the '{@link #getGeneralizationsToSubclasses() <em>Generalizations To Subclasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizationsToSubclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizationsToSubclasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OntoUMLClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcorePackage.Literals.ONTO_UML_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndurantType get_type() {
		return _type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_type(EndurantType new_type) {
		EndurantType old_type = _type;
		_type = new_type == null ? _TYPE_EDEFAULT : new_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcorePackage.ONTO_UML_CLASS__TYPE, old_type, _type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizationsToSuperclasses() {
		if (generalizationsToSuperclasses == null) {
			generalizationsToSuperclasses = new EObjectResolvingEList<Generalization>(Generalization.class, this, XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUPERCLASSES);
		}
		return generalizationsToSuperclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralizationsToSubclasses() {
		if (generalizationsToSubclasses == null) {
			generalizationsToSubclasses = new EObjectResolvingEList<Generalization>(Generalization.class, this, XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUBCLASSES);
		}
		return generalizationsToSubclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntoUMLClass> getSuperclasses() {
		BasicEList<OntoUMLClass> _xblockexpression = null; {
			final BasicEList<OntoUMLClass> supers = new BasicEList<OntoUMLClass>();
			final Consumer<Generalization> _function = new Consumer<Generalization>() {
				public void accept(final Generalization it) {
					supers.add(it.getSuperclass());
				}
			};
			this.getGeneralizationsToSuperclasses().forEach(_function);
			_xblockexpression = supers;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OntoUMLClass> getSubclasses() {
		BasicEList<OntoUMLClass> _xblockexpression = null; {
			final BasicEList<OntoUMLClass> subs = new BasicEList<OntoUMLClass>();
			final Consumer<Generalization> _function = new Consumer<Generalization>() {
				public void accept(final Generalization it) {
					subs.add(it.getSuperclass());
				}
			};
			this.getGeneralizationsToSubclasses().forEach(_function);
			_xblockexpression = subs;
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUltimateSortal() {
		return (((Objects.equal(this.get_type(), EndurantType.KIND) || Objects.equal(this.get_type(), EndurantType.RELATOR_KIND)) || Objects.equal(this.get_type(), EndurantType.MODE_KIND)) || Objects.equal(this.get_type(), EndurantType.QUALITY_KIND));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSortal() {
		return (((this.isUltimateSortal() || Objects.equal(this.get_type(), EndurantType.SUBKIND)) || Objects.equal(this.get_type(), EndurantType.ROLE)) || Objects.equal(this.get_type(), EndurantType.PHASE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonSortal() {
		return ((!this.isSortal()) && (!Objects.equal(this.get_type(), EndurantType.NONE)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRigid() {
		return (((!this.isSemiRigid()) && (!this.isSemiRigid())) && (!Objects.equal(this.get_type(), EndurantType.NONE)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSemiRigid() {
		EndurantType __type = this.get_type();
		return Objects.equal(__type, EndurantType.MIXIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAntiRigid() {
		return (((Objects.equal(this.get_type(), EndurantType.ROLE) || Objects.equal(this.get_type(), EndurantType.PHASE)) || Objects.equal(this.get_type(), EndurantType.ROLE_MIXIN)) || Objects.equal(this.get_type(), EndurantType.PHASE_MIXIN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcorePackage.ONTO_UML_CLASS__TYPE:
				return get_type();
			case XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUPERCLASSES:
				return getGeneralizationsToSuperclasses();
			case XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUBCLASSES:
				return getGeneralizationsToSubclasses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XcorePackage.ONTO_UML_CLASS__TYPE:
				set_type((EndurantType)newValue);
				return;
			case XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUPERCLASSES:
				getGeneralizationsToSuperclasses().clear();
				getGeneralizationsToSuperclasses().addAll((Collection<? extends Generalization>)newValue);
				return;
			case XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUBCLASSES:
				getGeneralizationsToSubclasses().clear();
				getGeneralizationsToSubclasses().addAll((Collection<? extends Generalization>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XcorePackage.ONTO_UML_CLASS__TYPE:
				set_type(_TYPE_EDEFAULT);
				return;
			case XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUPERCLASSES:
				getGeneralizationsToSuperclasses().clear();
				return;
			case XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUBCLASSES:
				getGeneralizationsToSubclasses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XcorePackage.ONTO_UML_CLASS__TYPE:
				return _type != _TYPE_EDEFAULT;
			case XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUPERCLASSES:
				return generalizationsToSuperclasses != null && !generalizationsToSuperclasses.isEmpty();
			case XcorePackage.ONTO_UML_CLASS__GENERALIZATIONS_TO_SUBCLASSES:
				return generalizationsToSubclasses != null && !generalizationsToSubclasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case XcorePackage.ONTO_UML_CLASS___GET_SUPERCLASSES:
				return getSuperclasses();
			case XcorePackage.ONTO_UML_CLASS___GET_SUBCLASSES:
				return getSubclasses();
			case XcorePackage.ONTO_UML_CLASS___IS_ULTIMATE_SORTAL:
				return isUltimateSortal();
			case XcorePackage.ONTO_UML_CLASS___IS_SORTAL:
				return isSortal();
			case XcorePackage.ONTO_UML_CLASS___IS_NON_SORTAL:
				return isNonSortal();
			case XcorePackage.ONTO_UML_CLASS___IS_RIGID:
				return isRigid();
			case XcorePackage.ONTO_UML_CLASS___IS_SEMI_RIGID:
				return isSemiRigid();
			case XcorePackage.ONTO_UML_CLASS___IS_ANTI_RIGID:
				return isAntiRigid();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (_type: ");
		result.append(_type);
		result.append(')');
		return result.toString();
	}

} //OntoUMLClassImpl
